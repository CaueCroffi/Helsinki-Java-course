/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Pichau
 */
public class Dictionary {

    private Map<String, String> translations;

    public void Dictionary() {
        translations = new HashMap<>();
    }

    public String get(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }

    public String getRandomWord() {
        String[] pick = this.translations.keySet().toArray(new String[this.translations.size()]);
        Random random = new Random();
        return pick[random.nextInt(pick.length)];
    }
}
