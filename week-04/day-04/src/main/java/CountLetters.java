import java.util.HashMap;

import static java.lang.Character.isLetter;

public class CountLetters {

	String text;

	public CountLetters(String word) {
		this.text = word;
	}

	public String getText() {
		return text;
	}

	public HashMap<String, Integer> letterCounter(String someText) {
		HashMap<String, Integer> occurrence = new HashMap<>();
		for (Character letter : someText.toCharArray()) {
			if (isLetter(letter)) {
				if (occurrence.containsKey(letter.toString())) {
					occurrence.replace(letter.toString(), occurrence.get(letter.toString()) + 1);
				} else {
					occurrence.put(letter.toString(), 1);
				}
			}
		}
		return occurrence;
	}
}
