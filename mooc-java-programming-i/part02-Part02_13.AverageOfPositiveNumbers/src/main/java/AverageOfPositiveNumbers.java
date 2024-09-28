
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int numbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            }
            if (value > 0) {
                numbers++;
                sumOfNumbers += value;
            }
        }
        if (numbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + ((double) sumOfNumbers / numbers));
        }
    }
}
