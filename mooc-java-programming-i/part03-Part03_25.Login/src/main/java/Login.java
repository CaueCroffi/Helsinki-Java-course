
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myUsers = new ArrayList<>(Arrays.asList("alex", "emma"));
        ArrayList<String> myPasswords = new ArrayList<>(Arrays.asList("sunshine", "haskell"));

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (myUsers.contains(username) && myPasswords.contains(password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
