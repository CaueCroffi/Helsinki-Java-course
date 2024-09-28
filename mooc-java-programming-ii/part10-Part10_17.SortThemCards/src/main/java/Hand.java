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
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.stream().forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(cards);
    }

    private int totalValue() {
        return cards.stream().mapToInt(i -> i.getValue()).sum();
    }

    public int compareTo(Hand hand) {
        return this.totalValue() - hand.totalValue();
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

}
