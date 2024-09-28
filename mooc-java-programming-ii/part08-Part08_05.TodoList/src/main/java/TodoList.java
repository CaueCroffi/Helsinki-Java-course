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

public class TodoList {

    private ArrayList<String> myTasks;

    public TodoList() {
        this.myTasks = new ArrayList<>();
    }

    public void add(String task) {
        this.myTasks.add(task);
    }

    public void remove(int task) {
        this.myTasks.remove(task - 1);
    }

    public void print() {
        int index = 1;
        for (String i : this.myTasks) {
            System.out.println(index + ": " + i);
            index++;
        }
    }

}
