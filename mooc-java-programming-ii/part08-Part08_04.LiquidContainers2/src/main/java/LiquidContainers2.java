
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerA = new Container();
        Container containerB = new Container();

        while (true) {
            System.out.println("First: " + containerA);
            System.out.println("Second: " + containerB);

            String[] input = scan.nextLine().split(" ");

            if (input[0].equals("quit")) {
                break;
            }
            int value = Integer.valueOf(input[1]);
            switch (input[0]) {
                case "add":
                    containerA.add(value);
                    break;
                case "remove":
                    containerB.remove(value);
                    break;
                case "move":
                    containerA.move(value, containerB);
                    break;
            }
        }
    }
}
