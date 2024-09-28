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

public class BirdsDatabase {

    private ArrayList<Bird> birdsSeen;

    public BirdsDatabase() {
        birdsSeen = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        birdsSeen.add(new Bird(name, latinName));
    }

    public void observation(String name) {
        for (Bird i : birdsSeen) {
            if (i.getName().equals(name)) {
                i.observed();
            }
        }
    }

    public String one(String name) {
        for (Bird i : birdsSeen) {
            if (i.getName().equals(name)) {
                return i.toString();
            }
        }
        return "Not a bird!";
    }
    
    public ArrayList<Bird> birdsSeen(){
        return this.birdsSeen;
    }
}
