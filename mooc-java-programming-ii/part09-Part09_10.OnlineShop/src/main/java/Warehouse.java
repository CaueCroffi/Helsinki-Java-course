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
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStored;

    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStored = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productsPrice.put(product, price);
        this.productsStored.put(product, stock);
    }

    public int price(String product) {
        if (this.productsPrice.containsKey(product)) {
            return this.productsPrice.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.productsStored.get(product) == null) {
            return 0;
        }
        return this.productsStored.get(product);
    }

    public boolean take(String product) {
        if (this.productsStored.get(product) != null) {
            int currentStock = this.productsStored.get(product);
            if (currentStock > 0) {
                this.productsStored.put(product, currentStock - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        return this.productsPrice.keySet();
    }

}
