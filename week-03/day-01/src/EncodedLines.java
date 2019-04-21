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
			// Looping though each line and each character, which are turned to arrays just for the sake of loop.
			for (int i = 0; i < line.toCharArray().length; i++) {
				char letter = line.charAt(i);
				// This eliminates the change of " " to different ASCII character and just adds it.
				if (letter == ' ') {
					holderString += " ";
				} else {
					// I had the figure out how to decode the elements and found out their ASCII value is shifted.
					// So here the current char is turned to ASCII value and I created appropriate following and preceding
					// ASCII character. Than I´m must replacing the current char with the following or preceding char
					// according the ASCII value.
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
			// First decrypted line is added to my list and than the helper string is reset for new iteration.
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

