
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        
        while (true) {
            int valueToAdd = Integer.valueOf(scanner.nextLine());
            if (valueToAdd == 9999) {
                break;
            }
            myList.add(valueToAdd);
        }
        
        ArrayList<Integer> indexFound = new ArrayList<>();        
        int smallestFound = myList.get(0);
        
        for (int i : myList){
            if (i < smallestFound) {
                smallestFound = i;
            }
        }
        
        System.out.println("Smallest number: " + smallestFound);
        
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == smallestFound) {
                System.out.println("Found at index: " + i);
            }
        }

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
    }
}
