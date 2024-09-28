
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> myList = new ArrayList<>();
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == -1) {
                break;
            }
            myList.add(value);
        }

        int totalSum = 0;

        for (Integer i : myList) {
            totalSum += i;
        }

        System.out.println("Average: " + (double)totalSum / myList.size());

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
    }
}
