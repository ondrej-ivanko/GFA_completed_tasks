import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        boolean condition = number % 2 == 0;


        if (condition) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}


// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.