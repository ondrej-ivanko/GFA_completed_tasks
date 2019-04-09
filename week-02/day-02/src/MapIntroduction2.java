import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> secondMap = new HashMap<>();
        secondMap.put("978-1-60309-452-8", "A Letter to Jo");
        secondMap.put("978-1-60309-459-7", "Lupus");
        secondMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        secondMap.put("978-1-60309-461-0", "The Lab");
        for (Map.Entry<String, String>entry : secondMap.entrySet()
             ) {
            System.out.println(entry.getValue() + " (ISBN: " + entry.getKey() + ")");
        }
        secondMap.remove("978-1-60309-444-3");
        secondMap.remove("978-1-60309-461-0", "The Lab");
        System.out.println(secondMap);
        secondMap.put("978-1-60309-450-4", "They Called Us Enemy");
        secondMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(secondMap.get("478-0-61159-424-8"));
        System.out.println(secondMap.get("978-1-60309-453-5"));
    }
}
