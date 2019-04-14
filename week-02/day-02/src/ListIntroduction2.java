import java.util.ArrayList;
import java.util.Arrays;

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
        listb.addAll(new ArrayList<>(Arrays.asList("Pumello", "Passion Fruit")));
        System.out.println(listb);
        System.out.println(listA.get(4));
    }
}
