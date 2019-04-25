import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTest {

	@Test
		public void summedList() {
		ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(1, 2, 3));
		Sum extralist = new Sum(newList);
		assertEquals(6, extralist.summedList(newList));
	}

}
