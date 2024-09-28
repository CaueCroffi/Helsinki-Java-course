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

public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public boolean hasIngredient(String ingredient) {
        return this.ingredients.contains(ingredient);
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime + ".";
    }
}
