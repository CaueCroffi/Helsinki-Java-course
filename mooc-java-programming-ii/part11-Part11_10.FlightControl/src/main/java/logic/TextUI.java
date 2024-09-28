/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Pichau
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private FlightControl flightControl;

    public TextUI(Scanner scanner, FlightControl flightControl) {
        this.scanner = scanner;
        this.flightControl = flightControl;
    }

    public void start() {
        System.out.println("Airport Asset Control");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Give the airplane id: ");
                String planeID = scanner.nextLine();
                System.out.println("Give the airplane capacity: ");
                int planeCapacity = Integer.valueOf(scanner.nextLine());

                this.flightControl.addAirplane(planeID, planeCapacity);

                System.out.println("");

            } else if (input.equals("2")) {
                System.out.println("Give the airplane id: ");
                String planeID = scanner.nextLine();
                System.out.println("Give the departure airport id: ");
                String departure = scanner.nextLine();
                System.out.println("Give the target airport id: ");
                String destination = scanner.nextLine();

                this.flightControl.addFlight(planeID, departure, destination);

                System.out.println("");
            } else if (input.equals("x")) {
                break;
            }
        }
        System.out.println("Flight Control");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            String input = scanner.nextLine();
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                this.flightControl.printPlanes();
                System.out.println("");
            } else if (input.equals("2")) {
                this.flightControl.printFlights();
                System.out.println("");
            } else if (input.equals("3")) {
                System.out.println("Give the airplane id: ");
                this.flightControl.printSpecificPlane(scanner.nextLine());
                System.out.println("");
            }
        }
    }
}
