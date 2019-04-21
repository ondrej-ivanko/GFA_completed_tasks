import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedOrder {

	public static void main(String[] args) {
		// Create a method that decrypts reversed-order.txt
		Path filename = Paths.get("reversed-order.txt");
		reversedOrder(filename);
	}

	public static void reversedOrder(Path filename) {
		try {
			List<String> originalText = Files.readAllLines(filename);
			for (int line = originalText.size() - 2; line >= 0; line--) {
				List<String> reversedList = Files.readAllLines(filename);
				String lineToRemove = originalText.get(line);
				reversedList.remove(line);
				reversedList.add(lineToRemove);
				Files.write(filename, reversedList);
			}
		} catch (IOException exception) {
				System.out.println("Canot edit file.");
		}
	}
}