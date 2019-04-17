import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubled {

	public static void main(String[] args) {
	// Create a method that decrypts the duplicated-chars.txt
		Path filename = Paths.get("duplicated-chars.txt");
		System.out.println(removeStringDuplication(filename));
	}

	public static List<String> removeStringDuplication(Path filename) {
		// File´s content is first flushed to List
		List<String> content = new ArrayList<>();
		try {
			content = Files.readAllLines(filename);
		} catch (IOException exception) {
			System.out.println("The " + filename + " cannot be read.");
		}
		// Than I set up new List where the decrypted string will be stored.
		List<String> correctString = new ArrayList<>();
		// First the loop enters row and than every character. The correct ones are added to line variable for appending
		// to correctString.
			for (String rows : content) {
				String line = "";
				for (int i = 0; i < rows.length(); i++) {
					if (i % 2 == 0) {
						line += rows.charAt(i);
					}
				}
				correctString.add(line);
				// After loop is finished. I write every single line back to original source file. Voilá!
				try {
					Files.write(filename, correctString);
				} catch (IOException e) {
					System.out.println("The " + filename + " cannot be accessed.");
				}
			}
		return correctString;
	}
}
