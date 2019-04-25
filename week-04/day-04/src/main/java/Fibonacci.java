public class Fibonacci {

	int fib;

	public Fibonacci(int fib) {
		this.fib = fib;
	}

	public int getFib() {
		return fib;
	}

	public int fibonacci(int fib) {
		if (fib <= 0) {
			return 0;
		} if (fib == 1) {
			return 1;
		} else {
			return fibonacci(fib - 1) + fibonacci(fib - 2);
		}
	}
}
