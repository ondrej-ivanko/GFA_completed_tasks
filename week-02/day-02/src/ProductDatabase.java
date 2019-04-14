import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Eggs", 200);
        productPrices.put("Milk", 200);
        productPrices.put("Fish", 400);
        productPrices.put("Apples", 150);
        productPrices.put("Bread", 50);
        productPrices.put("Chicken", 550);
        productDatabaseBrowser(productPrices, "Fish");
    }
    // productDatabaseBrowser is returning multiple information stated right below in function declaration.
    public static void productDatabaseBrowser(HashMap<String, Integer> database, String Item) {
        int priceItem = database.get(Item);
        String mostExpensive = "";
        String cheapest = "";
        int cheapItem = database.get(Item);
        int expensiveItem = 0;
        int summedPrices = 0;
        int under300 = 0;
        boolean is125 = false;
        for (Map.Entry<String, Integer>entry : database.entrySet()
             ) {
            summedPrices += entry.getValue();
            if (entry.getValue() > expensiveItem) {
                mostExpensive = entry.getKey(); expensiveItem = entry.getValue();
            } if (entry.getValue() < cheapItem) {
                cheapest = entry.getKey(); cheapItem = entry.getValue();
            } if (entry.getValue() < 300) {
                under300 += 1;
            } if (entry.getValue() == 125) {
                is125 = true;
            }
        }
        int average = summedPrices / 2;

        System.out.println("The " + Item + " costs " + priceItem + ".");
        System.out.println("The most expensive product in inventory is currently " + mostExpensive + ".");
        System.out.println("The least expensive product in inventory is currently " + cheapest + ".");
        System.out.println("Average price for all products is " + average);
        System.out.println("Amount of products currently in inventory under 300 is " + under300);

        if (is125 == true) System.out.println("There is/are product/s for 125 in inventory.");
        else System.out.println(("There is/are no product/s for 125 in inventory."));


    }
}
