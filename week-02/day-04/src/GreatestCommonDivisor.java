public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int divisor;
        int num = 15;
        int num2 = 45;
        if (num >= num2) {
            divisor = num;
        } else {
            divisor = num2;
        }
        System.out.println(commonDivisor(num, num2, divisor));
    }

    public static int commonDivisor(int num, int num2, int divisor) {
        if (num % divisor == 0 & num2 % divisor == 0) {
            return divisor;
        } else {
            return commonDivisor(num, num2, divisor - 1);
        }
    }
}
