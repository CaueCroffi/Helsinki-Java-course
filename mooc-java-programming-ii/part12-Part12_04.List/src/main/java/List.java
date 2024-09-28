/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class List<T> {

    private T[] myList;
    private int firstFreeIndex;

    public List() {
        myList = (T[]) new Object[10];
        firstFreeIndex = 0;
    }

    public void add(T value) {
        if (this.myList.length == this.firstFreeIndex) {
            grow();
        }

        this.myList[firstFreeIndex] = value;
        firstFreeIndex++;
    }

    public T value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.myList[index];
    }

    public void grow() {
        int newSize = this.myList.length + this.myList.length / 2;
        T[] temporaryArray = (T[]) new Object[newSize];

        for (int i = 0; i < this.firstFreeIndex; i++) {
            temporaryArray[i] = this.myList[i];
        }
        this.myList = temporaryArray;
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < this.myList.length; i++) {
            if (this.myList[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void moveLeft(int from) {
        for (int i = from; i < this.firstFreeIndex; i++) {
            this.myList[i] = this.myList[i + 1];
        }
    }

    public void remove(T value) {
        this.moveLeft(indexOfValue(value));
        this.firstFreeIndex--;
    }

    public boolean contains(T value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.myList[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
}
