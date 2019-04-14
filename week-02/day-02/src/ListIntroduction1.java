import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);
        names.add("William");
        boolean i = names.isEmpty();
        System.out.println(i);
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        // First option to print out names in reverse with numbers next to them:
        for (String name : names) {
            System.out.println(name);
        }
        for (int j = 0; j < names.size(); j++) {
            System.out.println((j + 1) + ". " + names.get(j) );
        }
        // Second option:
        int idx = 1;
        for (String name : names) {
            System.out.println(idx + ". " + name);
            idx++;
        }
        names.remove(1);

        for (int j = names.size() - 1; j >= 0; j--) {
            System.out.println(names.get(j));
        }
        names.clear();
    }
}
