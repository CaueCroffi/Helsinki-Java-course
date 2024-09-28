/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Hideout<T> {

    T t;

    public Hideout() {
        this.t = null;
    }

    public void putIntoHideout(T toHide) {
        this.t = toHide;
    }

    public T takeFromHideout() {
        return this.t;
    }

    public boolean isInHideout() {
        return t == null;
    }
}
