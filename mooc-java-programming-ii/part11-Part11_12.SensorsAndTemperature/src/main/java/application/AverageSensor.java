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
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors = new ArrayList<>();
    private List<Integer> readings = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int read() {
        if (!isOn() || this.sensors.size() == 0) {
            throw new IllegalStateException();
        }
        int reading = (int) Math.round(sensors.stream().mapToInt(i -> i.read()).average().getAsDouble());
        readings.add(reading);
        return reading;
    }

    @Override
    public void setOff() {
        this.sensors.get(0).setOff();
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    public List<Integer> readings() {
        return this.readings;
    }

}
