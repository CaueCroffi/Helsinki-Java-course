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

public class Package {

    private ArrayList<Gift> packagedGifts = new ArrayList<>();

    public void addGift(Gift gift) {
        packagedGifts.add(gift);
    }

    public int totalWeight() {
        int weight = 0;
        for (Gift i : packagedGifts) {
            weight += i.getWeight();
        }
        return weight;
    }
}
