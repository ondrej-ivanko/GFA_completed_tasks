import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("William A. Lathan", "405-709-1865");
        phoneBook.put("John K. Miller", "402-247-8568");
        phoneBook.put("Hortensia E. Foster", "606-481-6467");
        phoneBook.put("Amanda D. Newland", "319-243-5613");
        phoneBook.put("Brooke P. Askew", "307-687-2982");
        contactsSearcher(phoneBook, "Chris E. Myers");
    }

    public static void contactsSearcher(HashMap<String, String> yellowPages, String contactInfo) {
        String name = "";
        String number = "";
        for (Map.Entry<String, String>entry : yellowPages.entrySet()
             ) {
            if (contactInfo == entry.getKey()) {
                number += (entry.getValue());
            } else if (contactInfo == entry.getValue()){
                name = (entry.getKey());
            }
        }
        String searchResult;
        if (name != "") {
            searchResult = "The contact for " + contactInfo + " is " + name + " .";
        } else if (number != ""){
            searchResult = "The number for " + contactInfo + " is " + number + " .";
        } else {
            searchResult = "The " + contactInfo + " is not in the Telephone book.";
        }

        System.out.println(searchResult);
    }
}
