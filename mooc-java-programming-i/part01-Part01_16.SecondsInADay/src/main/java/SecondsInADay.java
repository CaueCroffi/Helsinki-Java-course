
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        System.out.println("How many days would you like to convert to seconds?");
        number = Integer.valueOf(scanner.nextLine());
        System.out.println(number*24*3600);

        // Write your program here

    }
}
