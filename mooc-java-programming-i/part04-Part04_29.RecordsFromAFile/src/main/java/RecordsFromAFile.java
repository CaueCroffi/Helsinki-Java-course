
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String currentLine = fileReader.nextLine();
                if (currentLine.isEmpty()) {
                    continue;
                }
                String[] currentLineSplit = currentLine.split(",");
                System.out.println(currentLineSplit[0] + ", age: " + currentLineSplit[1] + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
