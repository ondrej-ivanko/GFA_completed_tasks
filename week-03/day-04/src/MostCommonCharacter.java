import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonCharacter {
	public static void main(String[] args) {
		Path filename = Paths.get("countchar.txt");
		mostCommonChar(filename);

	}

	public static void mostCommonChar(Path filename) {
		List<String> wholeText = new ArrayList<>();
		try {
			wholeText = Files.readAllLines(filename);
		} catch (IOException exception) {
			System.out.println("File does not exist.");
		}
		HashMap<String, Integer> occurenceOfChar = new HashMap<>();
		String fullText = "";
		for (String line : wholeText) {
			fullText += line;
		}
		for (int i = 0; i < fullText.length(); i++) {
			String searchedString = fullText.substring(i, i + 1);
			if (searchedString.equals(".") == false & searchedString.equals("-") == false
							    & searchedString.equals(" ") == false) {
				int split = fullText.split(searchedString).length - 1;
				occurenceOfChar.put(searchedString, split);
				}
		}
		int maxOccurence = 0;
		String letter = "";
		for (Map.Entry<String, Integer> entry: occurenceOfChar.entrySet()) {
			if (maxOccurence < entry.getValue()) {
				maxOccurence = entry.getValue(); letter = entry.getKey();
			}
		}
		System.out.println(letter + " : " + maxOccurence);
	}
}