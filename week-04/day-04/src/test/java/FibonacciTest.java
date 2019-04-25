import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

	@Test
	public void fibonacciTestIfReturnsCorrectFibonacciNumberReturnsBoolean() {
		Fibonacci number = new Fibonacci(20);
		assertEquals(6765 , number.fibonacci(20));
	}
}
