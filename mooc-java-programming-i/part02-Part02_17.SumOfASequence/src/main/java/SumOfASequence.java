
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int sequenceEnd = Integer.valueOf(scanner.nextLine());
        int result = 0;

        for (int i = 0; i <= sequenceEnd; i++) {
            result += i;
        }
        System.out.println("The sum is " + result);
    }
}
