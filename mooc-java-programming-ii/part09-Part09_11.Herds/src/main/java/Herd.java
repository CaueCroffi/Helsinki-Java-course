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

public class Herd implements Movable {

    private ArrayList<Movable> members;

    public Herd() {
        members = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.members.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable i : members) {
            i.move(dx, dy);
        }
    }

    public String toString() {
        String toReturn = "";
        for (Movable i : members) {
            toReturn += i.toString() + "\n";
        }
        return toReturn;
    }
}
