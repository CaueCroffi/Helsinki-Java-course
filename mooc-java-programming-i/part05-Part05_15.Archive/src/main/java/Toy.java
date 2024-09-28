/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Toy {

    String identifier;
    String name;

    public Toy(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Toy)) {
            return false;
        }
        Toy comparedToy = (Toy) compared;
        if (this.identifier.equals(comparedToy.identifier)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
