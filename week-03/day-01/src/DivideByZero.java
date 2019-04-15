public class DivideByZero {
	public static void main(String[] args) {
		int num = 16;
		DivisionByZero(num);
	}

	public static void DivisionByZero(int divisor) {
		try {
			int result = divisor / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("fail");
		}
	}
}
