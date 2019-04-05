import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String stars = "";
        for (int i = 1; i < number; i++) {
            System.out.println(stars = stars + "*");
        }
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
    }
}
