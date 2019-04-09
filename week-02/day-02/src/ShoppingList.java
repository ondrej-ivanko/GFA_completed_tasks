import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("Eggs", "milk", "fish", "apples", "bread", "chicken"));
        String item = "banana";
        shoppingListChecker(shoppingList, item);
    }

    public static void shoppingListChecker(ArrayList<String> list, String searchedItem) {
        if (list.contains(searchedItem)) {
            System.out.println(searchedItem + " is on the shopping list.");
            } else {
            System.out.println(searchedItem + " is not on the shopping list.");
        }
    }
}
