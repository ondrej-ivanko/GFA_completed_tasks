import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

	public static void main(String[] args) {
		// Create a method that decrypts reversed-lines.txt
		Path filename = Paths.get("reversed-lines.txt");
		reverseLines(filename);
	}

	public static void reverseLines(Path filename) {
		List<String> file = new ArrayList<>();
		try {
			file = Files.readAllLines(filename);
		} catch (IOException ex) {

		}
		String swappedLine = "";
		List<String> swappedFile = new ArrayList<>();
		for (String line : file) {
			for (int i = line.length() - 1; i >= 0; i--) {
				swappedLine += line.substring(i, i + 1);
			}
			swappedFile.add(swappedLine);
			swappedLine = "";
		}
		try {
			Files.write(filename, swappedFile);
		} catch (IOException ex) {
			System.out.println("Cannot edit file.");
		}
	}
}
