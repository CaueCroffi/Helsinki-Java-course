
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String word = scanner.nextLine();

        System.out.println(word.equals("true") ? "You got it right!" : "Try again!");

    }
}
