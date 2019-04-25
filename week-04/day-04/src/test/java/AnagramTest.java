import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {

	@Test
	public void checkAnagramChecksIfTwoStringAreAnagramsReturnsBoolean() {
		String text1 = "Why";
		String text2 = "yyh";
		Anagram anagram = new Anagram(text1, text2);
		assertEquals(false, anagram.checkAnagram(text1, text2));
	}
}
