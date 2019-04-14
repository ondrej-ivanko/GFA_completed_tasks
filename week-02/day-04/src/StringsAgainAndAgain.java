public class StringsAgainAndAgain {
    public static void main(String[] args) {
        String inputed = "XsXXxxxyyyioklk hlkf hlk!%0 jdlkfjxYYx";
        System.out.println(stringsAgain(inputed, inputed.length() - 1));
    }
    // Function inputs * between every char in original string except for " ".
    public static String stringsAgain(String sentence, int count) {
        if (count <= 0) return sentence;
        char followingChar = sentence.charAt(count - 1);
        if (followingChar == ' ') {
            return stringsAgain(sentence, count - 2);
        } else {
            sentence = sentence.substring(0, count).concat("*" + sentence.substring(count));
            return stringsAgain(sentence, count - 1);
        }
    }
}
