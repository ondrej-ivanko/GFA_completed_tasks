public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(numberAdder(10));
    }

    public static int numberAdder(int num) {
        if (num <= 1) return 1;
        System.out.println(num);
        return num + numberAdder(num - 1);
    }
}
