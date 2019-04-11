import java.util.Scanner;

public class IntroduceYourself {
    public static void main(String[] args) {
        // Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line.
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87
        System.out.println("State your name, age and height in m in that order.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Scanner input2 = new Scanner(System.in);
        String age = input2.nextLine();
        Scanner input3 = new Scanner(System.in);
        String height = input3.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

    }
}