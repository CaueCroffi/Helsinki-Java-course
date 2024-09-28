/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Counter {

    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int startValue) {
        this.value = startValue;
    }

    public void increase() {
        this.increase(1);
    }

    public void increase(int i) {
        this.value += i < 0 ? 0 : i;
    }

    public void decrease() {
        this.decrease(1);
    }

    public void decrease(int i) {
        this.value -= i < 0 ? 0 : i;
    }

    public int value() {
        return this.value;
    }

}
