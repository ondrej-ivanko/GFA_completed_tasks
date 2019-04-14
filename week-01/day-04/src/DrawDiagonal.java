import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        // Loop is used to construct square line by line. "If" condition is set for only first and last line of square.
        for (int i = 0; i <= number; i++) {
            String line = "";
            if (i == 0 || i == number) {
                for (int j = 0; j <= number; j++) {
                    line += "%";
                }
                System.out.println(line);
            // The loop prints all lines between 0 and last creating diagonal.
            } else {
                for (int y = 0; y <= number; y++) {
                    if (y == i || y == 0 || y == number) {
                        line += "%";
                    } else {
                        line += " ";
                    }
                }
                System.out.println(line);
            }

        }
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
    }
}
