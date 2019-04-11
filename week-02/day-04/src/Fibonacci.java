public class Fibonacci {
    public static void main(String[] args) {
        int fibStart = 0;
        int fibNext = 1;
        int baseCaseNumsCount = 2;
        System.out.println(fibonacciNo(fibStart, fibNext, 20 - baseCaseNumsCount));
    }

    public static int fibonacciNo(int baseNum, int baseNum2, int fibonacciN) {
        int fib = baseNum+ baseNum2;
        if (fibonacciN <= 0) return fib;
        return fibonacciNo(baseNum2, fib, fibonacciN - 1);
    }
}
