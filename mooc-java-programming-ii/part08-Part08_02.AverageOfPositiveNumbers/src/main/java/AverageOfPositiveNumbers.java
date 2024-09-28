
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int totalNumbers = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                sumOfNumbers += input;
                totalNumbers++;
            }
        }
        if (totalNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumOfNumbers / totalNumbers);
        }

    }
}
