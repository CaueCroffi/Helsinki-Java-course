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
    private Class grades;

    public UserInterface(Scanner scanner, Class grades) {
        this.scanner = scanner;
        this.grades = grades;
    }
    
    public void start(){
        while (true){
            String input = scanner.nextLine();
            switch(input){
                case "-1":
                    System.out.println("Point average (all): " + grades.totalAverage());
                    System.out.println("Point average (passing): " + grades.passingAverage());
                    System.out.println("Pass percentage: " + grades.passPercentage());
                    System.out.println(grades);
                    return;
                default:
                    grades.add(Integer.valueOf(input));
            }
        }
    }
}
