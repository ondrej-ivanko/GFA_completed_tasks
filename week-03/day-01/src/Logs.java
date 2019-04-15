import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Logs {
	public static void main(String[] args) {
		Path filename = Paths.get("log.txt");
		extractIps(filename);
	}

	public static ArrayList<String> extractIps(Path filename) {
		List<String> logs = new ArrayList<>();
		try {
			logs = Files.readAllLines(filename);
		} catch (Exception IOException) {
			System.out.println("Problem.");
		}
		ArrayList<String[]> split = new ArrayList<>();
		for (int i = 0; i < 500; i++) {
			logs.set(i, logs.get(i).replace("   ", " ").replace("  ", " "));
			split.add(logs.get(i).split(" "));
		}
		ArrayList<String> ipAdressess = new ArrayList<>();
		for (String[] element : split) {
			ipAdressess.add(element[5]);
			System.out.println(element[5]);
		}
		return ipAdressess;
	}
}
