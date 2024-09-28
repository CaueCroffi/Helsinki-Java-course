
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;

        while (true) {
            System.out.println("Give a number:");
            value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            } else if (value > 0) {
                System.out.println(value * value);
            } else {
                System.out.println("Unsuitable number");
            }
        }

    }
}
