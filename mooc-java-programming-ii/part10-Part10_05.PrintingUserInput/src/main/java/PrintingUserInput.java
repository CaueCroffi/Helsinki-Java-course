
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> myString = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            myString.add(input);
        }
        myString.stream().forEach(i -> System.out.println(i));
    }
}
