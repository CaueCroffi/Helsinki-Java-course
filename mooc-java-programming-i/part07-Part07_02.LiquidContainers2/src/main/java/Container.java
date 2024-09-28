/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Container {

    private int maxValue;
    private int currentValue;

    public Container() {
        this.maxValue = 100;
        this.currentValue = 0;
    }

    public void add(int value) {
        if (value > 0) {
            this.currentValue += value;
        }
        if (this.currentValue > this.maxValue) {
            this.currentValue = this.maxValue;
        }
    }

    public void remove(int value) {
        if (value > 0) {
            this.currentValue -= value;
        }
        if (this.currentValue < 0) {
            this.currentValue = 0;
        }
    }

    public void move(Container toMove, int value) {
        if (value < this.currentValue) {
            toMove.add(value);
        } else {
            toMove.add(this.currentValue);
        }
        remove(value);
    }
    
    public int contains(){
        return this.currentValue;
    }

    public String toString() {
        return this.currentValue + "/" + this.maxValue;
    }
}
