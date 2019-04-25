import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountlettersTest {

	@Test
	public void letterCounterShouldReturnHashMapWithStringKeysAndOccurrenceCountOfCharacterInStringReturnsBoolean() {
		CountLetters object = new CountLetters("forever");
		HashMap<String, Integer> testMap = new HashMap<>();
		testMap.put("f", 1);
		testMap.put("o", 1);
		testMap.put("r", 2);
		testMap.put("e", 2);
		testMap.put("v", 1);
		assertEquals(testMap, object.letterCounter("forever"));
	}

}
