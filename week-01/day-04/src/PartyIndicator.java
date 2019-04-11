import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int girls = input.nextInt();
        int boys = input.nextInt();

        if (girls > 0) {
            if (boys == girls && ((boys + girls) >= 20)) {
                System.out.println("Party is excellent!");
            } else if (boys != girls && ((boys + girls) >= 20)) {
                System.out.println("Quite cool party!");
            } else if (boys + girls <= 20) {
                System.out.println("Average party...");
            }
        } else {
            System.out.println("Sausage party.");
        }
    }
}
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        //
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
