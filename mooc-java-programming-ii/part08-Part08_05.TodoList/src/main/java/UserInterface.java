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
    
    private TodoList tasks;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.tasks = list;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                return;
            }
            switch (input) {
                case "add":
                    System.out.println("To add: ");
                    tasks.add(scanner.nextLine());
                    break;
                case "list":
                    tasks.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    tasks.remove(Integer.valueOf(scanner.nextLine()));
            }
        }
    }
}
