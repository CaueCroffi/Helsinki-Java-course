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

public class Room {

    private ArrayList<Person> people;

    public Room() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        return people.size() == 0;
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }
        Person shortestPerson = people.get(0);
        for (Person i : people) {
            if (shortestPerson.getHeight() > i.getHeight()) {
                shortestPerson = i;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (people.isEmpty()) {
            return null;
        }
        Person shortestToReturn = shortest();
        people.remove(shortest());
        return shortestToReturn;
    }
}
