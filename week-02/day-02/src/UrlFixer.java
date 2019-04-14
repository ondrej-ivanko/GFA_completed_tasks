import com.sun.xml.internal.fastinfoset.util.CharArray;

public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
        // First solution:
        url = url.replace("bots", "odds").replace("//", "://");
        System.out.println(url);
        // Second solution:
        String subString1 = url.substring(0,5).concat(":");
        String subString2 = url.substring(5, url.length()-4).concat("odds");
        String desiredUrl = subString1.concat(subString2);
        System.out.println(desiredUrl);
        // Third solution:
        // Original string is turned to char array and dissected character by character with amendments.
        char[] charedString = url.toCharArray();
        String correctUrl = "";
        for (int i = 0; i < url.length(); i++) {
            if (i == 5) {
                correctUrl += ":";
                correctUrl += charedString[i];
            } else if (i == url.length()-4) {
                correctUrl += "odds";
            }
            else {
                correctUrl += charedString[i];
            }
        }
        System.out.println(correctUrl);
    }
}
