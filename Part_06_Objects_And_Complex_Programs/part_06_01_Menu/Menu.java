package Part_06_Objects_And_Complex_Programs.part_06_01_Menu;

import java.util.ArrayList;
public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    // implement the required methods here
    public void addMeal(String meal){
        if(!meals.contains(meal)){
            this.meals.add(meal);
        }
    }
    public void printMeals(){
        for(String meal: this.meals){
            System.out.println(meal);
        }
    }
    public void clearMenu(){
        this.meals.clear();
    }
}
