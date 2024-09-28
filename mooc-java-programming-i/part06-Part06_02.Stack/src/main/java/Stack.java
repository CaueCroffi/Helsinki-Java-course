
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pichau
 */
public class Stack {

    private ArrayList<String> string = new ArrayList<>();

    public boolean isEmpty() {
        return this.string.size() > 0 ? false : true;
    }

    public void add(String value) {
        this.string.add(value);
    }

    public ArrayList<String> values() {
        return this.string;
    }

    public String take() {
        String stringToReturn = this.string.get(this.string.size() - 1);
        this.string.remove(this.string.size() - 1);
        return stringToReturn;
    }

}
