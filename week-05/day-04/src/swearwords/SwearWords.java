package swearwords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {

	public static void main(String[] args) {
		Path file = Paths.get("swearwords.txt");

		fileReader();
		swearCleaner(file);
	}

	public static int swearCleaner(Path file) {
		List<String> wholeText = fileReader();
		ArrayList<String> badwords = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"));
		List<String> newText = new ArrayList<>();
		int counter = 0;
		for (String line : wholeText) {
			if (line != "") {
			line = line.toLowerCase();
			for (String word : badwords) {
				if (line.contains(word)) {
					counter = counter + 1;
					line = line.replaceFirst(word, "");
				}
			}
			}
			newText.add(line);
		}
		try {
			Files.write(file, newText);
		} catch (IOException ex) {
		}
		System.out.println(counter);
		return counter;
	}

	public static List<String> fileReader() {
		Path file = Paths.get("swearwords.txt");
		List<String> allLines = new ArrayList<>();
		try {
			allLines = Files.readAllLines(file);
		} catch (IOException ex) {
		}
		return allLines;
	}
}
