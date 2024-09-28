
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class LiteracyComparison {

    public static void main(String[] args) {

        HashMap<Double, String[]> literacyList;
        ArrayList<String> myList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(Paths.get("literacy.csv"));
            while (scanner.hasNextLine()) {
                myList.add(scanner.nextLine());

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getCause());
        }
        myList.stream()
                .map(i -> i.split(","))
                .sorted((x, y) -> x[5].compareTo(y[5]))
                .forEach(i -> System.out.println(i[3] + " (" + i[4] + "), " + i[2].substring(0, i[2].length()-4).trim() + ", " + i[5]));

    }
}
