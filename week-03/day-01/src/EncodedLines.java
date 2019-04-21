import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

	public static void main(String[] args) {
		// Create a method that decrypts encoded-lines.txt
		Path filename = Paths.get("encoded-lines.txt");
		decrypt(filename);

	}

	public static void decrypt(Path filename) {
		List<String> file = new ArrayList<>();
		try {
			file = Files.readAllLines(filename);
		} catch (IOException ex) {
			System.out.println("Cannot read file.");
		}
		String holderString = "";
		List<String> decryptedFile = new ArrayList<>();
		for (String line : file) {
			for (int i = 0; i < line.toCharArray().length; i++) {
				char letter = line.charAt(i);
				if (letter == ' ') {
					holderString += " ";
				} else {
					  int ascii = (int) letter;
					  char nextAscii = (char) (ascii + 1);
					  char previousAscii = (char) (ascii - 1);
					  if (i < line.toCharArray().length + 1) {
					  	holderString += previousAscii;
					  } else {
					  	holderString += nextAscii;
					  }
				}
			}
			decryptedFile.add(holderString);
			holderString = "";
		}
		try {
			Files.write(filename, decryptedFile);
		} catch (IOException ex) {
			System.out.println("File not editable.");
		}
	}
}

