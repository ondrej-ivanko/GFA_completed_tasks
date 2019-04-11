public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1456));
    }

    public static int sumOfDigits(int num) {
        if (num < 10) { return num;}

        else {int digit = num % 10; return digit + sumOfDigits(num / 10);}
    }
}
