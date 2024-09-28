
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println("Search for?");
        int numberToFind = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> indexFound = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == numberToFind) {
                indexFound.add(i);
            }
        }

        if (indexFound.size() > 0) {
            for (int i : indexFound) {
                System.out.println(numberToFind + " is at index " + i);
            }
        }

        // implement here finding the indices of a number
    }
}
