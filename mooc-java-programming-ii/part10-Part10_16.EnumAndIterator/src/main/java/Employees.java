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
import java.util.List;
import java.util.Iterator;

public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(i -> this.employees.add(i));
    }

    public void print() {
        this.employees.stream().forEach(System.out::println);
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
