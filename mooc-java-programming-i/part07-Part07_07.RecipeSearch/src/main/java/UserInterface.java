/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipeList = new ArrayList<>();

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        try {
            Scanner recipeReader = new Scanner(Paths.get(scanner.nextLine()));
            while (recipeReader.hasNextLine()) {
                String name = recipeReader.nextLine();
                int cookingTime = Integer.valueOf(recipeReader.nextLine());
                Recipe currentRecipe = new Recipe(name, cookingTime);
                while (true) {
                    String ingredient = "";
                    if (recipeReader.hasNextLine()) {
                        ingredient = recipeReader.nextLine();
                    }
                    if (!ingredient.equals("")) {
                        currentRecipe.addIngredient(ingredient);
                    } else {
                        break;
                    }
                }
                this.recipeList.add(currentRecipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            String input = scanner.nextLine();
            switch (input) {
                case "list":
                    for (Recipe i : recipeList) {
                        System.out.println(i);
                    }
                    break;
                case "find name":
                    System.out.println("Searched word: ");
                    String recipeToLocate = scanner.nextLine();
                    System.out.println("Recipes: ");
                    for (Recipe i : recipeList) {
                        if (i.getName().contains(recipeToLocate)) {
                            System.out.println(i);
                        }
                    }
                    break;
                case "find cooking time":
                    System.out.println("Max cooking time: ");
                    int maxTime = Integer.valueOf(scanner.nextLine());
                    for (Recipe i : recipeList) {
                        if (i.getCookingTime() <= maxTime) {
                            System.out.println(i);
                        }
                    }
                    break;
                case "find ingredient":
                    System.out.println("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    for (Recipe i : recipeList) {
                        if (i.hasIngredient(ingredient)) {
                            System.out.println(i);
                        }
                    }
                    break;
                case "stop":
                    return;
            }
        }
    }
}
