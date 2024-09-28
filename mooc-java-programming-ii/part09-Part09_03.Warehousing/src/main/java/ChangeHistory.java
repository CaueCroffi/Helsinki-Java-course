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

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history = new ArrayList<>();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (this.history.size() == 0) {
            return 0;
        }

        double value = this.history.get(0);
        for (double i : this.history) {
            if (i > value) {
                value = i;
            }
        }
        return value;
    }

    public double minValue() {

        if (this.history.size() == 0) {
            return 0;
        }

        double value = this.history.get(0);
        for (double i : this.history) {
            if (i < value) {
                value = i;
            }
        }
        return value;
    }

    public double average() {
        if (this.history.size() == 0) {
            return 0;
        }
        double value = 0;
        double count = 0;
        for (double i : this.history) {
            value += i;
            count++;
        }
        return (value / count);
    }

    public double lastValue() {
        return this.history.get(this.history.size() - 1);
    }
}
