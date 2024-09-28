import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> bookList = new ArrayList<>();
        
        while (true){
            System.out.println("Title: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Pages: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            bookList.add(new Book(name, pages, publicationYear));
        }
        
        System.out.println("What information will be printed? ");
        String infoToPrint = scanner.nextLine();
        
        if (infoToPrint.equals("everything")) {
            for (Book i : bookList){
                System.out.println(i);
            }
        }
        
        if (infoToPrint.equals("name")) {
            for (Book i : bookList){
                System.out.println(i.getTitle());
            }            
        }
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
