
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int years = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            if (Integer.valueOf(input.split(",")[0].length()) > longestName.length()) {
                longestName = input.split(",")[0];
            }
            years += Integer.valueOf(input.split(",")[1]);
            count++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double)years / count));
    }
}
