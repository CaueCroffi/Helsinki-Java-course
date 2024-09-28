
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to?");
        int countUp = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int countFrom = Integer.valueOf(scanner.nextLine());
        
        for (int i = countFrom; i <= countUp; i++) {
            System.out.println(i);
        }

        // Write your program here
    }
}
