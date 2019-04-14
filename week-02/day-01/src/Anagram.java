import java.util.Arrays;

public class Anagram {
        public static void main(String[] args) {
            String word = "HoEhH";
            String word2 = "oehhh";
            System.out.println(anagram(word, word2));
        }
        public static boolean anagram(String phrase1, String phrase2) {
            if (phrase1.length() != phrase2.length()) return false;
            int timesCharsAreSame = 0;
            for (int i = 0; i < phrase1.length(); i++) {
                for (int j = 0; j <phrase2.length(); j++) {
                    if (phrase1.substring(i, i+1).equalsIgnoreCase(phrase2.substring(j, j+1))) {
                        phrase2 = phrase2.substring(0, j).concat(phrase2.substring(j+1));
                        timesCharsAreSame += 1;
                        break;
                    }
                }
            }
            if (timesCharsAreSame == phrase1.length()) {
                return true;
            } else {
                return false;
            }
        }
}
