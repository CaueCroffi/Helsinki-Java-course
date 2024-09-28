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

public class Suitcase {

    private ArrayList<Item> storedItems;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.storedItems = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight() {
        int currentWeight = 0;
        if (!this.storedItems.isEmpty()) {
            for (Item i : this.storedItems) {
                currentWeight += i.getWeight();
            }
        }
        return currentWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maximumWeight) {
            this.storedItems.add(item);
        }
    }

    public String toString() {
        if (this.storedItems.size() == 0) {
            return "no items (" + totalWeight() + "kg )";
        }
        if (this.storedItems.size() == 1) {
            return "1 item (" + totalWeight() + "kg )";
        }
        return this.storedItems.size() + "items (" + totalWeight() + "kg )";
    }

    public void printItems() {
        for (Item i : this.storedItems) {
            System.out.println(i);
        }
    }

    public Item heaviestItem() {
        if (this.storedItems.isEmpty()) {
            return null;
        }
        Item heaviest = this.storedItems.get(0);
        for (Item i : this.storedItems) {
            if (heaviest.getWeight() < i.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }
}
