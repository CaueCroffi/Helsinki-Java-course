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

    private int maxVolume;
    private int currentVolume;

    public Container() {
        this.maxVolume = 100;
        this.currentVolume = 0;
    }

    public void add(int value) {
        if (value <= 0) {
            return;
        }
        if (value + this.currentVolume > this.maxVolume) {
            this.currentVolume = this.maxVolume;
        } else {
            this.currentVolume += value;
        }
    }

    public void remove(int value) {
        if (value <= 0) {
            return;
        }
        if (this.currentVolume - value < 0) {
            this.currentVolume = 0;
        } else {
            this.currentVolume -= value;
        }
    }
    
    public void move(int value, Container container){
        if (value < 0) {
            return;
        }
        if(this.currentVolume - value < 0){
            value = this.currentVolume;
        }
        this.remove(value);
        container.add(value);
    }

    public int contains() {
        return this.currentVolume;
    }

    public String toString() {
        return (this.currentVolume + "/" + this.maxVolume);
    }

}
