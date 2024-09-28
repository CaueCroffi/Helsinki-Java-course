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
public class StandardSensor implements Sensor {

    private int temp;

    public StandardSensor(int temp) {
        this.temp = temp;
    }

    @Override
    public void setOff() {
    }

    @Override
    public void setOn() {
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public int read() {
        return this.temp;
    }
}
