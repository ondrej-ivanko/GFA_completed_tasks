import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();
        int center = numberOfLines / 2;
        int holder = 1;

        for (int i = 0; i <= numberOfLines; i++) {
            String line = "";
            if (i <= center) {
                for (int j = 0; j <= numberOfLines; j++) {
                    if (j < center - i || j > center + i) {
                        line += " ";
                    } else {
                        line += "*";
                    }
                }
            } else {

                for (int j = 0; j <= numberOfLines; j++) {
                    if (numberOfLines % 2 != 0) {
                        if (j >= numberOfLines - (numberOfLines - holder) && j < numberOfLines - holder) {
                            line += "*";
                        } else {
                            line += " ";
                        }
                    /* In code below is the optimization of code in case user inputs even numbers. Even numbers cannot
                    create perfectly symmetrical diamond. I inserted conditional which extends right bottom side of
                    the diamond shape, which adds an extra line to given number of lines. It could also be solved by
                    shortening the diamond in top half, so it does not extend over given amount of lines. Or by mirroring
                    the bottom half of diamond so it reflects below.
                     */
                    } else {
                        if (j >= numberOfLines - (numberOfLines - holder) && j <= numberOfLines - holder) {
                            line += "*";
                        } else {
                            line += " ";
                        }
                    }
                }
                holder += 1;
            }
            System.out.println(line);

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
