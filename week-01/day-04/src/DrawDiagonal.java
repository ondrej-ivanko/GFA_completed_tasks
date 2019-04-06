import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            String line = "";
            if (i == 0 || i == number) {
                for (int j = 0; j <= number; j++) {
                    line += "%";
                }
                System.out.println(line);
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
