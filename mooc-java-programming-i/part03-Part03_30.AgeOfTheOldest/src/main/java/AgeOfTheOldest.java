
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String oldest = "";
        int age = 0;
        
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            if (Integer.valueOf(input.split(",")[1]) > age) {
                oldest = input.split(",")[0];
                age = Integer.valueOf(input.split(",")[1]);
            }
        }
        System.out.println("Age of the oldest: " + age);

    }
}
