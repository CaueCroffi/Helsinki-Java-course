/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Pichau
 */
import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean isOn;

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public int read() {
        if (!isOn) {
            throw new IllegalStateException();
        }
        return (new Random().nextInt(61)) - 30;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

}
