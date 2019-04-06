import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();
        for (int i = 0; i <= numberOfLines; i++) {
            String oneLine = "";
            if (i == 0 || i == numberOfLines) {
                for (int j = 0; j <= numberOfLines; j++) {
                    oneLine += "%";
                }
            } else {
                for (int j = 0; j <= numberOfLines; j++) {
                    if (j == 0 || j == numberOfLines){
                        oneLine += "%";
                    } else {
                        oneLine += " ";
                    }
                }
            }
            System.out.println(oneLine);
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
