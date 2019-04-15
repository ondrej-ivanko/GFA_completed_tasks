import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
	public static void main(String[] args) {
		Path originalFilename = Paths.get("my-file.txt");
		Path copyOfFile = Paths.get("lines_file.txt");
		System.out.println(copiesContent(originalFilename, copyOfFile));
	}

	public static boolean copiesContent(Path originalFilename, Path copyOfFile) {
		try {
			List<String> content = Files.readAllLines(originalFilename);
			Files.write(copyOfFile, content);
		} catch (Exception CannotCopy) {
			return false;
		}
		return true;
	}
}
