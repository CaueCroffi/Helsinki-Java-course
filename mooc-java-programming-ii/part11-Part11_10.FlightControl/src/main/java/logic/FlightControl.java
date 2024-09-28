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
import java.util.HashMap;
import domain.*;

public class FlightControl {

    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    private Scanner scanner;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addPlace(String place) {
        this.places.putIfAbsent(place, new Place(place));
    }

    public void addAirplane(String planeID, int planeCapacity) {
        airplanes.put(planeID, new Airplane(planeID, planeCapacity));
    }

    public void addFlight(String plane, String departure, String arrival) {
        addPlace(departure);
        addPlace(arrival);
        Flight flight = new Flight(this.airplanes.get(plane), this.places.get(departure), this.places.get(arrival));
        this.flights.put(flight.toString(), flight);
    }

    public void printFlights() {
        for (Flight i : flights.values()) {
            System.out.println(i);
        }
    }

    public void printSpecificPlane(String id) {
        System.out.println(this.airplanes.get(id));
    }

    public void printPlanes() {
        for (Airplane i : this.airplanes.values()) {
            System.out.println(i);
        }
    }
}
