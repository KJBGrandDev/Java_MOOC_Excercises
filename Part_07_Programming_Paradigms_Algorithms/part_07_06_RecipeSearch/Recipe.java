package Part_07_Programming_Paradigms_Algorithms.part_07_06_RecipeSearch;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTimeMax;
    private ArrayList<String> ingredients;

    public Recipe(){
        this.ingredients = new ArrayList<>();
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCookingTimeMax(int time){
        this.cookingTimeMax = time;
    }

    public void setIngredients(String ingredient){
        ingredients.add(ingredient);
    }

    public String getName(){
        return this.name;
    }

    public int getCookingTimeMax(){
        return this.cookingTimeMax;
    }

    public boolean containsThisIngredient(String ingredient){
        for(String i: ingredients){
            if(i.equals(ingredient)){
                return true;
            }
        }
        return false;
    }
}
