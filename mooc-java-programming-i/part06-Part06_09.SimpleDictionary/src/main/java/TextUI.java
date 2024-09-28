

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pichau
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void addToDictionary(){
        System.out.println("Word: ");
        String wordToAdd = scanner.nextLine();
        System.out.println("Translation: ");
        String translationToAdd = scanner.nextLine();

        dictionary.add(wordToAdd, translationToAdd);
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = this.scanner.nextLine();
            switch (input) {
                case "end":
                    System.out.println("Bye Bye!");
                    return;
                case "add":
                    addToDictionary();
                    continue;
                case "search":
                    String wordToSearch = scanner.nextLine();
                    String translation = this.dictionary.translate(wordToSearch);
                    if (translation == null) {
                        System.out.println("Word " + wordToSearch + " was not found");
                        continue;
                    }
                    System.out.println("Translation: " + translation);
                    continue;
                    
                default:
                    System.out.println("Unknown command");
                    
            }
        }
    }
}
