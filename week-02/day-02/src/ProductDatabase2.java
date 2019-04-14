import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> productsDatabase = new HashMap<>();
        productsDatabase.put("Eggs", 200);
        productsDatabase.put("Milk", 200);
        productsDatabase.put("Fish", 400);
        productsDatabase.put("Apples", 150);
        productsDatabase.put("Bread", 50);
        productsDatabase.put("Chicken", 550);
        ProductDatabaseChecker(productsDatabase);
    }

    public static void ProductDatabaseChecker(HashMap<String, Integer> database) {
        String lessThan201_List = "";
        String over150_List = "";
        for (Map.Entry<String, Integer>entry : database.entrySet()
             ) {
            if (entry.getValue() < 201) {
                lessThan201_List += entry.getKey() + ", ";
            } if (entry.getValue() > 150) {
                over150_List += entry.getKey() + " : " + entry.getValue() + ", ";
            }
        }
        System.out.println("Products that costs less than 201: " + lessThan201_List);
        System.out.println("Products that cost more than 150: " + over150_List);
    }
}
