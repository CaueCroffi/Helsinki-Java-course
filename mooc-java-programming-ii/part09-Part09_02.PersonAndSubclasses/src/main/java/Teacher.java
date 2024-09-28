/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Teacher extends Person {

    private int wage;

    public Teacher(String name, String adress, int salary) {
        super(name, adress);
        this.wage = salary;
    }

    public String toString() {
        return super.toString() + "\n  salary " + this.wage + " euro/month";
    }
}
