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

    private TodoList toDo;
    private Scanner scanner;

    public UserInterface(TodoList toDo, Scanner scanner) {
        this.toDo = toDo;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = this.scanner.nextLine();
            switch (input) {
                case "stop":
                    return;
                case "add":
                    System.out.println("To add: ");
                    String taskToAdd = this.scanner.nextLine();
                    this.toDo.add(taskToAdd);
                    break;
                case "list":
                    this.toDo.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    int toRemove = Integer.valueOf(this.scanner.nextLine());
                    this.toDo.remove(toRemove);
                    break;
            }
        }
    }

}
