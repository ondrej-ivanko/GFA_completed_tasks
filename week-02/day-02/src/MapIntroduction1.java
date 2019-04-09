import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    public static void main(String[] args) {
        HashMap<Integer, String> firstMap = new HashMap<>();
        System.out.println(firstMap.isEmpty());
        firstMap.put(97, "a");
        firstMap.put(98, "b");
        firstMap.put(99, "c");
        firstMap.put(65, "A");
        firstMap.put(66, "B");
        firstMap.put(67, "C");
        for (Integer key : firstMap.keySet()
             ) {
            System.out.println(key);
        }
        for (String value : firstMap.values()
        ) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, String>entry : firstMap.entrySet()
             ) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        firstMap.put(68, "D");
        System.out.println(firstMap.size());
        System.out.println(firstMap.get(99));
        firstMap.remove(97);
        System.out.println(firstMap.get(100));
        if (firstMap.get(100) != null) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        firstMap.clear();
    }
}
