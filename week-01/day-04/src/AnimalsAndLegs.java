import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        int pig = 4;
        int chicken = 2;
        Scanner input = new Scanner(System.in);
        int chickenCount = input.nextInt();
        int pigCount = input.nextInt();
        int legsCount = chickenCount * chicken + pigCount * pig;
        System.out.println(legsCount);
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}
