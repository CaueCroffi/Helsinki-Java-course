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

    private Scanner scanner;
    private Container first;
    private Container second;

    public UserInterface(Scanner scanner, Container first, Container second) {
        this.scanner = scanner;
        this.first = first;
        this.second = second;
    }

    public void Start() {
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String[] input = scanner.nextLine().split(" ");
            switch (input[0]) {
                case "quit":
                    return;
                case "add":
                    first.add(Integer.valueOf(input[1]));

                    continue;
                case "move":
                    first.move(second, Integer.valueOf(input[1]));

                    continue;
                case "remove":
                    second.remove(Integer.valueOf(input[1]));
                    continue;
            }

        }

    }

}
