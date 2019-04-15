import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
	public static void main(String[] args) {
		try {
		Path filePath = Paths.get("my-file.txt");
		List<String> linesOfFile = Files.readAllLines(filePath);
		System.out.println(linesOfFile);
		} catch (Exception exception) {
			System.out.println("Unable to read from this file.");
		}
	}
}
