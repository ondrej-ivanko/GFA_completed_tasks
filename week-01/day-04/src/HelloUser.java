import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner user = new Scanner(System.in);
        System.out.println("Hello user, please state your name.");
        String nameInput = user.nextLine();
        System.out.println("Hello " + nameInput + " !");
    }
}
