
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sumOfValue = 0;
        int totalNumbers = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");
        while (true) {
            int typedValue = Integer.valueOf(scanner.nextLine());
            if (typedValue == -1) {
                break;
            }
            if (typedValue % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            totalNumbers++;
            sumOfValue += typedValue;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumOfValue);
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Average: " + ((double) sumOfValue / totalNumbers));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
