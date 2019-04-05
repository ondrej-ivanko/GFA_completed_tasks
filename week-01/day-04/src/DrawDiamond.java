import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();
        int maxWidth = numberOfLines * 2;
        int center = maxWidth / 2;

        for (int r = 0; r < 1; r++) {
            for (int i = 0; i <= numberOfLines - 1; i++) {
                String line = "";
                for (int j = 0; j <= maxWidth; j++) {
                    if ( j < center - i || j > center + i) {
                        line += " ";
                    } else {
                        line += "*";
                    }
                }
                System.out.println(line);
            }
            for (int s = 0; s <= numberOfLines - 1; s++) {
                String line = "";
                for (int j = 0; j <= maxWidth; j++) {
                    if (j <= maxWidth - (maxWidth - s) || j >= maxWidth - s) {
                        line += " ";
                    } else {
                        line += "*";
                    }

                }
                System.out.println(line);
            }

        }

        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was
    }
}
