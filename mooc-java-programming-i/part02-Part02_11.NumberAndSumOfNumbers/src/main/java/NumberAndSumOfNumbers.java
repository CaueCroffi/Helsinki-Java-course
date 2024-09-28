
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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
            numbers ++;
            sumOfNumbers += value;
        }
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
