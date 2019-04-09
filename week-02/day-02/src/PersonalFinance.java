import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> finances = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        expenses(finances);
    }

    public static void expenses(ArrayList<Integer> money) {
        int spent = 0;
        int smallestExpense = money.get(0);
        int greatestExpense = money.get(0);
        for (Integer payment : money
             ) {
            spent += payment;
            if (payment < smallestExpense) {
                smallestExpense = payment;
            }
            if (payment > greatestExpense) {
                greatestExpense = payment;
            }
        }
        int average = spent / 2;
        System.out.println("Total amount of money spent already: " + spent);
        System.out.println("Average amount of money spent already: " + average);
        System.out.println("Your smallest expense so far is: " + smallestExpense);
        System.out.println("Your greatest expense so far is: " + greatestExpense);
    }
}
