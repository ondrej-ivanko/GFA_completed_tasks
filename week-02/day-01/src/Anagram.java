public class Anagram {
        public static void main(String[] args) {
            String word = "Horse";
            String word2 = "orHes";
            System.out.println(anagram(word, word2));
        }
        public static boolean anagram(String phrase1, String phrase2) {
            if (phrase1.length() != phrase2.length()) return false;
            int timesConditionTrue = 0;
            for (int i = 0; i < phrase1.length(); i++) {
                for (int j = 0; j <phrase2.length(); j++) {
                    System.out.println(phrase2.substring(j, j+1));
                    System.out.println(phrase1.substring(i, i+1));
                    if (phrase2.substring(j).equals(phrase1.substring(i))) timesConditionTrue += 1;
                }
            }
            if (timesConditionTrue == phrase1.length()) return true;
            return false;
        }
}
