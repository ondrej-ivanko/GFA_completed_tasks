import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        int sum = 0;
        int timesAsked = 5;
        System.out.println("Input " + timesAsked + " numbers.");
        for (int i = 0; i < timesAsked; i++) {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            sum += num;
        }
        int average = sum / 2;
        System.out.println(sum);
        System.out.println(average);
    }
}
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

