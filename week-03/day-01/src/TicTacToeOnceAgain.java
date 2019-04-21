import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToeOnceAgain {
	public static void main(String[] args) {
		// System.out.println(ticTacResult("win-o.txt"));
		// Should print "O"

		// System.out.println(ticTacResult("win-x.txt"));
		// Should print "X"

		// System.out.println(ticTacResult("draw.txt"));
		// Should print "Draw"
	}
// Very bad solution - not scalable and re-usable
	public static String ticTacResult(String file) {
		Path filename = Paths.get(file);
		List<String> linesOfGame = new ArrayList<>();
		try {
			linesOfGame = Files.readAllLines(filename);
		} catch (IOException exception){
			System.out.println("File does not exist or is not accessible.");
		}
		// Stringyfies the whole .txt file into one-line string.
		String fullString = "";
		for (String line : linesOfGame) {
			fullString += line;
		}
		// Checks for all possible winning combinations and returns winning symbol. If not met returns draw.
		for (int symbol = 0; symbol < fullString.length(); symbol++) {
			String currentString = fullString.substring(symbol, symbol + 1);
			if (symbol == 0) {
				if (currentString.equals(fullString.substring(symbol + 1, symbol + 2)) &
				currentString.equals(fullString.substring(symbol + 2, symbol + 3))) {
					return currentString;
				} else if (currentString.equals(fullString.substring(symbol + 4, symbol + 5)) &
				currentString.equals(fullString.substring(symbol + 8))) {
					return currentString;
				} else if (currentString.equals(fullString.substring(symbol + 3, symbol + 4)) &
				currentString.equals(fullString.substring(symbol + 6, symbol + 7))) {
					return currentString;
				}
			} if (symbol == 1) {
					if (currentString.equals(fullString.substring(symbol + 3, symbol + 4)) &
					currentString.equals(fullString.substring(symbol + 6, symbol + 7))) {
						return currentString;
					}
			}	if (symbol == (fullString.length() / 3) - 1) {
				if (currentString.equals(fullString.substring(symbol + 2, symbol + 3)) &
						currentString.equals(fullString.substring(symbol + 4, symbol + 5))) {
						return currentString;
				} else if (currentString.equals(fullString.substring(symbol + 4, symbol + 5)) &
								   currentString.equals(fullString.substring(symbol + 6))) {
									return currentString;
				}
			} if (symbol == 4) {
				if (currentString.equals(fullString.substring(symbol + 1, symbol + 2)) &
								    currentString.equals(fullString.substring(symbol + 2, symbol + 3))) {
					return currentString;
				}
			} if (symbol == 6) {
				if (currentString.equals(fullString.substring(symbol + 1, symbol + 2)) &
								    currentString.equals(fullString.substring(symbol + 2, symbol + 3))) {
					return currentString;
				}
			}
		}
		return "draw";
	}
}
