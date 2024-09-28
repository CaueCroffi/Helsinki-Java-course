
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";

        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(scan.nextLine());

        if (grade < 0) {
            result = "impossible!";
        } else if (grade <= 49) {
            result = "failed";
        } else if (grade <= 59) {
            result = "1";
        } else if (grade <= 69) {
            result = "2";
        } else if (grade <= 79) {
            result = "3";
        } else if (grade <= 89) {
            result = "4";
        } else if (grade <= 100) {
            result = "5";
        } else {
            result = "incredible!";
        }
        System.out.println("Grade: " + result);
    }
}
