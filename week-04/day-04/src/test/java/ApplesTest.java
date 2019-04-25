import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

	@Test
	public void applesWillInstantiateApplesClassTrue() {
		Apples green = new Apples("green");
		assertNotNull(green);
	}
	@Test
	public void getApplesWillReturnTheStringOfApplesReturnTheString() {
		Apples yellow = new Apples("yellow");
		assertEquals("yellow", yellow.getApple());
	}
}
