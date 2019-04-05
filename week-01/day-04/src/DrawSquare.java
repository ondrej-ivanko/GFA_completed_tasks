import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();
        for (int i = 0; i <= numberOfLines; i++) {
            if (i == 0 || i == numberOfLines) {
                System.out.println("%%%%%");
            } else {
                System.out.println("%   %");
            }
        }
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was
    }
}
