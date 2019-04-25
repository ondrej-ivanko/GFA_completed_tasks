import java.util.Arrays;

public class Anagram {

	String text1;
	String text2;

	public Anagram(String word, String word2) {
		this.text1 = word;
		this.text2 = word2;
	}

	public boolean checkAnagram(String text1, String text2) {
		if (text1.length() != text2.length()) {
			return false;
		} else {
			char[] list1 = text1.toCharArray();
			char[] list2 = text2.toCharArray();
			Arrays.sort(list1);
			Arrays.sort(list2);
			if (list1.equals(list2)) {
				return true;
			}
		}
		return false;
	}
}
