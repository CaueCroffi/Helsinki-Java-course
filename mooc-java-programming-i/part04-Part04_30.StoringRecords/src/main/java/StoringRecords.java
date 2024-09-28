
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String currentLine = fileReader.nextLine();

                if (currentLine.isEmpty()) {
                    continue;
                }
                String[] personOnFile = currentLine.split(",");
                persons.add(new Person(personOnFile[0], Integer.valueOf(personOnFile[1])));
            }
        } catch (Exception e) {

        }

        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}
