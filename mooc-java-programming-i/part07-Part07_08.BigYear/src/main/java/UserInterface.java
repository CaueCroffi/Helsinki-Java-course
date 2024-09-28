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

public class UserInterface {
    
    Scanner scanner;
    BirdsDatabase diary;
    
    public UserInterface(Scanner scanner, BirdsDatabase database) {
        this.scanner = scanner;
        this.diary = database;
    }
    
    public void Start() {
        while (true) {
            System.out.println("command?");
            String input = scanner.nextLine();
            String name = "";
            switch (input) {
                case "Quit":
                    return;
                case "Add":
                    System.out.println("Name: ");
                    name = scanner.nextLine();
                    System.out.println("Name in Latin: ");
                    String latin = scanner.nextLine();
                    diary.add(name, latin);
                    break;
                case "Observation":
                    System.out.println("Name: ");
                    name = scanner.nextLine();
                    diary.observation(name);
                    break;
                case "All":
                    for (Bird i : this.diary.birdsSeen()) {
                        System.out.println(i);
                    }
                    break;
                case "One":
                    System.out.println("Name: ");
                    name = scanner.nextLine();
                    System.out.println(this.diary.one(name));
                    break;
            }
        }
    }
    
}
