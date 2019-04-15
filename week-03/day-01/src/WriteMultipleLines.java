import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteMultipleLines {
	public static void main(String[] args) {
		int maxLines = 12;
		String word = "Hey-Ho.";
		Path filename = Paths.get("my-file.txt");
		editFile(filename, word, maxLines);

	}
	public static void editFile(Path file, String word, int maxLines) {
		try {
			for (int newText = 0; newText < maxLines; newText++) {
				List<String> formerContent =  Files.readAllLines(file);
				formerContent.add(word);
				Files.write(file, formerContent);
			}
		} catch (IOException CannotCopy) {
			}
	}
}
