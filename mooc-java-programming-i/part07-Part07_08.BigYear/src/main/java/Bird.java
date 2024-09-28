/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Bird {

    private String name;
    private String latinName;
    private int timesSeen;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.timesSeen = 0;
    }

    public void observed() {
        this.timesSeen++;
    }

    public String getName() {
        return this.name;
    }
    
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.timesSeen + " observations";
    }
}
