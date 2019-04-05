import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();
        String stars = "*";
        String emptyString = "";
        for (int i = 0; i < (numberOfLines - 1); i++) {
            emptyString += " ";
        }
        emptyString += "*";
        System.out.println(emptyString);
        String emptyStringLoop = "";
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < (numberOfLines - 1 - i); j++) {
                emptyStringLoop += " ";
            }
            emptyStringLoop += "**";
            System.out.println(emptyStringLoop);
        }
        /*for (int i = 0; i < numberOfLines; i++) {
            for (int j = (numberOfLines - i); j > 0 ; j--) {
                if (j == 1) {
                    emptyString += "*";
                } else {
                    emptyString += " ";
                }
            }
            if (i > 0) {
                emptyString += "**";
                System.out.println(emptyString);
            } else {
                System.out.println(emptyString);
            }
        }*/

        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
    }
}
