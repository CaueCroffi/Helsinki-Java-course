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

public class Pipe<T> {

    ArrayList<T> myValues;

    public Pipe() {
        myValues = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        myValues.add(value);
    }

    public T takeFromPipe() {
        return myValues.get(myValues.size() - 1);
    }

    public boolean isInPipe() {
        return myValues.size() > 0;
    }
}
