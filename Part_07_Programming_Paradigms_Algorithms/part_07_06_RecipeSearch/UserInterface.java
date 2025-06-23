package Part_07_Programming_Paradigms_Algorithms.part_07_06_RecipeSearch;

import java.util.Scanner;
import java.io.File;

public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner){
        this.scanner = scanner;
    }

    public void start(){
        System.out.print("File to read: ");
        String recipe = scanner.nextLine();

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
            processCommand(command,recipe);
        }
    }

    public void processCommand(String command, String recipe){
        switch(command){
            case "list":{
                list(recipe);
                break;
            }
            case "find name":{
                findByName(recipe);
                break;
            }
            case "find cooking time":{
                findByCookingTime(recipe);
                break;
            }
            case "find ingredient":{
                findByIngredient(recipe);
                break;
            }
        }
    }

    public void list(String recipe){
        File file = new File(recipe);
        try(Scanner scanner = new Scanner(file)){
            int counter = 0;
            while (scanner.hasNextLine()){
                String nextLine = scanner.nextLine();
                if(counter == 0){
                    System.out.print(nextLine);
                }
                if(counter == 1){
                    System.out.println(", cooking time: " + nextLine);
                }
                counter++;
                if(nextLine.isEmpty()){
                    counter = 0;
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
    public void findByName(String recipe) {
        System.out.print("Search word: ");
        String input = scanner.nextLine();

        File file = new File(recipe);
        try (Scanner scanner = new Scanner(file)) {
            int counter = 0;
            boolean found = false;
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (counter == 0) {
                    if(nextLine.contains(input)){
                        System.out.print(nextLine);
                        found = true;
                    }
                }
                if(counter == 1 && found){
                    System.out.println(", cooking time: " + nextLine);
                }
                counter++;
                if(nextLine.isEmpty()){
                    counter = 0;
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
    public void findByCookingTime(String recipe){
        System.out.print("Max cooking time: ");
        String input = scanner.nextLine();

        File file = new File(recipe);
        try(Scanner scanner = new Scanner(file)){
            int counter = 0;
            boolean found = false;
            String name = "";
            String cookingTime = "";
            while (scanner.hasNextLine()){
                String nextLine = scanner.nextLine();
                if(counter == 0){
                    name = nextLine;
                }
                if(counter == 1){
                    if(Integer.parseInt(nextLine) <= Integer.parseInt(input)){
                        cookingTime = ", cooking time: " + nextLine;
                        found = true;
                    }
                    if(found){
                        System.out.println(name + cookingTime);
                    }
                }
                counter++;
                if(nextLine.isEmpty()){
                    counter = 0;
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
    public void findByIngredient(String recipe){
        System.out.print("Ingredient: ");
        String input = scanner.nextLine();

        File file = new File(recipe);
        try(Scanner scanner = new Scanner(file)){
            int counter = 0;
            boolean found = false;
            String name = "";
            String cookingTime = "";
            System.out.println("\nRecipes:");
            while (scanner.hasNextLine()){
                String nextLine = scanner.nextLine();
                if(counter == 0){
                    name = nextLine;
                }
                if(counter == 1){
                    cookingTime = ", cooking time: " + nextLine;
                }
                if(counter >= 2){
                    if(nextLine.equals(input)){
                        System.out.println(name + cookingTime);
                    }
                }
                counter++;
                if(nextLine.isEmpty()){
                    counter = 0;
                    name = "";
                    cookingTime = "";
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
