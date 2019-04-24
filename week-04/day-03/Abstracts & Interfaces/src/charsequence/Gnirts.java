package charsequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

	String word;

	public Gnirts(String text) {
		String reversedString = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reversedString += text.charAt(i);
		}
		this.word = reversedString;
	}

	@Override
	public int length() {
		int count = 0;
		for (int i = 0; i < this.word.length(); i++) {
			count += 1;
		}
		return count;
	}

	@Override
	public char charAt(int index) {
		return this.word.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return null;
	}

	@Override
	public IntStream chars() {
		return null;
	}

	@Override
	public IntStream codePoints() {
		return null;
	}
}
