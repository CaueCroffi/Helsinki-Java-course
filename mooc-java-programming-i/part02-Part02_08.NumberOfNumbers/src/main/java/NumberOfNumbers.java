
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;

        while (true) {
            System.out.println("Give a number:");
            if (Integer.valueOf(scanner.nextLine()) == 0) {
                break;
            }
            numbers += 1;
        }
        System.out.println("Number of numbers: " + numbers);
    }
}
