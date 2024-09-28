
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pichau
 */
public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.capacity - item.getWeight() >= 0) {
            this.items.add(item);
            this.capacity -= item.getWeight();
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(ArrayList<Item> items) {
        for (Item i : items) {
            if (this.capacity - i.getWeight() >= 0) {
                this.items.add(i);
                this.capacity += i.getWeight();
            }
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item); //To change body of generated methods, choose Tools | Templates.
    }

}
