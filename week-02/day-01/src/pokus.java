public class pokus {
    public static void main(String[] args) {
        String word = "HoEhH";
        String word2 = "oehhh";
        System.out.println(anagram(word, word2));
    }
    public static boolean anagram(String phrase1, String phrase2) {
        char[] charedArray1 = phrase1.toCharArray();
        char[] charedArray2 = phrase2.toCharArray();
        if (phrase1.contentEquals(phrase2)) { return true; }
        else return false;
    }
}
