
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Class grades = new Class();

        UserInterface UI = new UserInterface(scanner, grades);

        UI.start();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
