/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.items.containsKey(product)) {
            this.items.get(product).increaseQuantity();
        } else {
            this.items.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (Item i : items.values()) {
            total += i.price();
        }
        return total;
    }

    public void print() {
        for (Item i : items.values()) {
            System.out.println(i);
        }
    }

}
