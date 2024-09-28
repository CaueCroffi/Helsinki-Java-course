/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Item {

    private String name;
    private int qty;
    private int value;

    public Item(String name, int qty, int value) {
        this.name = name;
        this.qty = qty;
        this.value = value;
    }

    public int price() {
        return this.value * this.qty;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    public String toString() {
        return this.name + ": " + this.qty;
    }

}
