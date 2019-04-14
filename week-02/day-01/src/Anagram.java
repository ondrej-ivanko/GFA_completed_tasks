public class Anagram {
        public static void main(String[] args) {
            String word = "HoEhH";
            String word2 = "oehhh";
            System.out.println(anagram(word, word2));
        }
        public static boolean anagram(String phrase1, String phrase2) {
            if (phrase1.length() != phrase2.length()) return false;
            int timesCharsAreSame = 0;
            // Loop check first char of first string if it appears in second string.
            for (int i = 0; i < phrase1.length(); i++) {
                for (int j = 0; j <phrase2.length(); j++) {
                    // If it finds match, that char is removed from second string to rule out the exception
                    // when there are more similar chars on other indexes the can return false positive of "If" condition.
                    // Condition ignores lower and Upper cases.
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
