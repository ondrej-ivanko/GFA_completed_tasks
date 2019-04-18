import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MostCommonReworked {
	public static void main(String[] args) {
		Path filename = Paths.get("countchar.txt");
		mostCommonChar(filename);
	}

	public static void mostCommonChar(Path filename) {
		List<String> linesOfText = new ArrayList<>();
		try {
			linesOfText = Files.readAllLines(filename);
		} catch (IOException exception) {
			System.out.println("File does not exist.");
		}
		String wholeText = "";
		for (String line : linesOfText) {
			wholeText += line;
		}
		HashMap<String, Integer> appearanceOfChars = new HashMap<>();
		for (int i = 0; i < wholeText.length(); i++) {
			String searchedString = wholeText.substring(i, i + 1 );
			if (searchedString.equals(" ") == false & searchedString.equals("." ) == false
							    & searchedString.equals("-") == false) {
				int counter = wholeText.length() - wholeText.replaceAll(searchedString, "" ).length();
				appearanceOfChars.put(searchedString, counter);
			}
		}
		String character = "";
		int count = 0;
		for (Map.Entry<String, Integer> entry : appearanceOfChars.entrySet()) {
			if (entry.getValue() > count) {
				count = entry.getValue();
				character = entry.getKey();
			}
		}
		System.out.println(character + " : " + count);
	}
}


