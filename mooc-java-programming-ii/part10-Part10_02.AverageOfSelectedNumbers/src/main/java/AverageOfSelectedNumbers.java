
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myValues = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            myValues.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        double average = 0;
        switch (choice) {
            case "n":
                average = myValues.stream()
                        .mapToInt(i -> Integer.valueOf(i))
                        .filter(f -> f < 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average of the negative numbers: " + average);
                break;
            case "p":
                average = myValues.stream()
                        .mapToInt(i -> Integer.valueOf(i))
                        .filter(f -> f > 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average of the positive numbers: " + average);
                break;
            default:
                average = 0;
        }
        

    }
}
