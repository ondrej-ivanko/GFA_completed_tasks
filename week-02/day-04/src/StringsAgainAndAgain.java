public class StringsAgainAndAgain {
    public static void main(String[] args) {
        String inputed = "XsXXxxxyyyioklk hlkf hlk!%0 jdlkfjxYYx";
        System.out.println(stringsAgain(inputed, inputed.length() - 1));
    }

    public static String stringsAgain(String sentence, int count) {
        if (count <= 0) return sentence;
        String followingChar = sentence.substring(count - 1, count);
        if (followingChar.equals(" ")) return stringsAgain(sentence, count - 2);
        sentence = sentence.substring(0, count).concat("*" + sentence.substring(count));
        return stringsAgain(sentence, count - 1);
    }
}
