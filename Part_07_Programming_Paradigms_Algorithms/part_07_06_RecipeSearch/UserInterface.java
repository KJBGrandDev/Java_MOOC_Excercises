package Part_07_Programming_Paradigms_Algorithms.part_07_06_RecipeSearch;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class UserInterface {
    private Scanner scanner;
    private Recipe recipe;
    private ArrayList<Recipe> recipeList;

    public UserInterface(Scanner scanner, Recipe recipe){
        this.scanner = scanner;
        this.recipe = recipe;
        this.recipeList = new ArrayList<>();
    }

    public void start(){
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        recipeCreator(fileName);
        while (true){
            System.out.println("\nCommands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipe by cooking time");
            System.out.println("find ingredient - searches recipe by ingredient");
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            processCommand(command,fileName);
        }
    }

    public void processCommand(String command, String recipe){
        switch(command){
            case "list":{
                list();
                break;
            }
            case "find name":{
                findByName();
                break;
            }
            case "find cooking time":{
                findByCookingTime();
                break;
            }
            case "find ingredient":{
                findByIngredient();
                break;
            }
        }
    }

    public void recipeCreator(String fileName){
        File file = new File(fileName);
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                Recipe recipe = new Recipe();

                String name = scanner.nextLine();
                recipe.setName(name);

                String cookingTime = scanner.nextLine();
                recipe.setCookingTimeMax(Integer.parseInt(cookingTime));

                recipeList.add(recipe);

                while(scanner.hasNextLine()){
                    String nextLine = scanner.nextLine();
                    recipe.setIngredients(nextLine);

                    if(nextLine.isEmpty()){
                        break;
                    }
                }
            }

        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    public void list(){
        for(Recipe recipe: recipeList){
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTimeMax());
        }
    }
    public void findByName() {
        System.out.print("Search word: ");
        String input = scanner.nextLine();

        for(Recipe recipe: recipeList){
            if(recipe.getName().contains(input)){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTimeMax());
            }
        }
    }
    public void findByCookingTime(){
        System.out.print("Max cooking time: ");
        String input = scanner.nextLine();

        for(Recipe recipe: recipeList){
            if(recipe.getCookingTimeMax() <= Integer.parseInt(input)){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTimeMax());
            }
        }
    }
    public void findByIngredient(){
        System.out.print("Ingredient: ");
        String input = scanner.nextLine();

        for(Recipe recipe : recipeList){
            if(recipe.containsThisIngredient(input)){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTimeMax());
            }
        }
    }
}
