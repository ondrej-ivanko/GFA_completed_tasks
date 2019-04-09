import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        ArrayList<String> listb = new ArrayList<>();
        listb.addAll(listA);
        System.out.println(listA.contains("Durian"));
        listb.remove("Durian");
        listA.add(5, "Kiwifruit");
        listA.indexOf("Avocado");
        listb.indexOf("Durian");
        int size = listb.size();
        listb.addAll(new ArrayList<>(Arrays.asList("Pumello", "Passion Fruit")));
        /*for (int i = listb.size(); i <= size; i++) {
            listb.add(i, "Pumello");
            listb.add(i + 1, "Passion fruit");
        }*/
        System.out.println(listb);
        System.out.println(listA.get(4));
    }
}
