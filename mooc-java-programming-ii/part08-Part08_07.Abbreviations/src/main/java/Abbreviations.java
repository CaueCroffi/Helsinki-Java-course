/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> abbreviationsList = new HashMap<>();

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviationsList.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviationsList.get(abbreviation) == null ? false : true;
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviationsList.get(abbreviation);
    }
}
