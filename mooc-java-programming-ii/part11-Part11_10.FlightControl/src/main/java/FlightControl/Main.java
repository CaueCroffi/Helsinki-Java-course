package FlightControl;

import java.util.Scanner;
import logic.TextUI;
import logic.FlightControl;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        TextUI UI = new TextUI(scanner,new FlightControl());
        
        UI.start();
    }
}
