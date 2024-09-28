/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
import java.util.ArrayList;

public class Box implements Packable{

    private double maxWeight;
    private ArrayList<Packable> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(Packable i) {
        if (this.maxWeight - i.weight() > 0) {
            this.items.add(i);
            this.maxWeight -= i.weight();
        }
    }

    public double weight() {
        double currentWeight = 0;
        for (Packable i : this.items) {
            currentWeight += i.weight();
        }
        return currentWeight;
    }

    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }

}
