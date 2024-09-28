
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (String i : hashmap.keySet()) {
            System.out.println(hashmap.get(i));
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (String i : hashmap.keySet()) {
            if (hashmap.get(i).getName().contains(text)) {
                System.out.println(hashmap.get(i));
            }
        }
    }

}
