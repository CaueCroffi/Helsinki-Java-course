
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Toy currentToy = new Toy(identifier, name);
            if (!toys.contains(currentToy)) {
                toys.add(currentToy);
            }
        }
        for (Toy i : toys){
            System.out.println(i);
        }
    }
}
