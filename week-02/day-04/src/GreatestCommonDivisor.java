public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int divisor = 0;
        int num = 25;
        int num2 = 20;
        if (num >= num2) divisor = num;
        divisor = num2;
        System.out.println(commonDivisor(num, num2, divisor));
    }

    public static int commonDivisor(int num, int num2, int divisor) {
        if (num % divisor == 0 & num2 % divisor == 0) return divisor;
        return commonDivisor(num, num2, divisor - 1);
    }
}
