public class Sum {
    public static void main(String[] args) {
        int limitNumber = 12;
        System.out.println(sum(limitNumber));
    }

    public static int sum(int limitNumber) {
        int sum = 0;
        for (int i = 0; i < limitNumber; i++) {
            sum += i;

        }
        return sum;
    }
    // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
}
