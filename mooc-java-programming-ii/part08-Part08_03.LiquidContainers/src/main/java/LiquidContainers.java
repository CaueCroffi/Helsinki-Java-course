
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int maxVolume = 100;

        while (true) {
            System.out.println("First: " + A + "/" + maxVolume);
            System.out.println("Second: " + B + "/" + maxVolume);

            String[] input = scan.nextLine().split(" ");

            if (input[0].equals("quit")) {
                break;
            }
            int value = Integer.valueOf(input[1]);
            if (value <= 0) {
                continue;
            }

            switch (input[0]) {
                case "add":
                    if (value + A >= maxVolume) {
                        A = maxVolume;
                    } else {
                        A += value;
                    }
                    break;
                case "move":
                    if (value > A) {
                        value = A;
                    }
                    A -= value;
                    if (B + value > maxVolume) {
                        B = maxVolume;
                    } else {
                        B += value;
                    }
                    break;
                case "remove":
                    if (value > B) {
                        B = 0;
                    } else {
                        B -= value;
                    }

                    break;
            }
        }
    }
}
