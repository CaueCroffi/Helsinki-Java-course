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

public class Hold {

    private ArrayList<Suitcase> luggage;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.luggage = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.luggage.add(suitcase);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        if (!this.luggage.isEmpty()) {
            for (Suitcase i : this.luggage) {
                currentWeight += i.totalWeight();
            }
        }
        return currentWeight;
    }

    public String toString() {
        return this.luggage.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printItems(){
        for (Suitcase i : luggage){
            i.printItems();
        }
    }
}
