import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Hi, please write down a number in kms and I will print it converted in miles.");
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        double miles = distance / 1.60934;
        System.out.println("Is " + miles + " miles.");
    }
}