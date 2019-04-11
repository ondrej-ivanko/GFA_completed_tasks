public class StringsAgainAndAgain {
    public static void main(String[] args) {
        String inputed = "XsXXxxxyyyioklk hlkf hlk!%0 jdlkfjxYYx";
        System.out.println(stringsAgain(inputed, inputed.length() - 1));
    }

    public static String stringsAgain(String sentence, int count) {
        if (count <= 0) return sentence;
        String character = sentence.substring(count, count + 1);
        String followingChar = sentence.substring(count - 1, count);
        if (character != " " && character != "*") {
            if (followingChar != " ") {
                sentence = sentence.replace(character, "*" + character);
            }
        }
        return stringsAgain(sentence, count - 1);
    }
}
