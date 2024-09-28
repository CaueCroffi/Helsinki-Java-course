/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Pichau
 */
public class Flight {

    private Airplane plane;
    private Place departure;
    private Place destination;

    public Flight(Airplane plane, Place departure, Place destination) {
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
    }

    public Airplane getPlane() {
        return plane;
    }

    public Place getDeparture() {
        return departure;
    }

    public Place getDestination() {
        return destination;
    }

    public String toString() {
        return this.plane + " (" + this.departure.getID() + "-" + this.destination.getID() + ")";
    }

}