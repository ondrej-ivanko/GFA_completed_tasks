import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
	public static void main(String[] args) {
		Path filename = Paths.get("day-01.iml");

		System.out.println(returnLinesTotal(filename));
	}


	public static int returnLinesTotal(Path file) {
		List<String> linesOfFile = new ArrayList<>();
		int sumLines = 0;
		try {
			linesOfFile = Files.readAllLines(file);
		} catch (Exception CannotAccessFile) {
			return 0;
		}
		for (String lines : linesOfFile) {
			sumLines++;
		}
		return sumLines;
	}
}
