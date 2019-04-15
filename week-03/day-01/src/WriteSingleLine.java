import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteSingleLine {
	public static void main(String[] args) {
		Path filename = Paths.get("my-file.txt");
		writeToFile(filename);
	}

	public static void writeToFile(Path file) {
		Scanner input = new Scanner(System.in);
		String myName = input.nextLine();
		ArrayList<String> content = new ArrayList<>();
		content.add(myName);
		try {
			Files.write(file, content);
		} catch (Exception CannotEditFile) {
			System.out.println("Unable to write file: my-file.txt");
		}
	}
}
