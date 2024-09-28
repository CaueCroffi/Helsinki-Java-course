
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> myNumbers = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            myNumbers.add(input);
        }
        myNumbers.stream().filter(i -> i > 0 && i < 6).forEach(System.out::println);
    }
}
