import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int newNumber = input.nextInt();
        if (newNumber <= 0) {
            System.out.println("Not enough.");
        } else if (newNumber == 1) {
            System.out.println("One.");
        } else if (newNumber == 2) {
            System.out.println("Two.");
        } else {
            System.out.println("A lot.");
        }

    }
}
