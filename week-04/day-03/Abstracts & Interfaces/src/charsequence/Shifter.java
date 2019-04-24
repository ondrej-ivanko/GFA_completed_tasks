package charsequence;

public class Shifter implements CharSequence {

	String word;
	int shiftAmount;

	public Shifter(String text, int shiftAmount) {
		String reversedString = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reversedString += text.charAt(i);
		}
		this.word = reversedString;
		this.shiftAmount = shiftAmount;

	}

	@Override
	public int length() {
		return 0;
	}

	@Override
	public char charAt(int index) {
		return this.word.charAt(index + this.shiftAmount);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return null;
	}


}
