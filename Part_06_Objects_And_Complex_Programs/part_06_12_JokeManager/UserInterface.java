package Part_06_Objects_And_Complex_Programs.part_06_12_JokeManager;

import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String input = scanner.nextLine();

            if(input.equals("X")){
                break;
            }

            processCommand(input);
        }
    }

    public void processCommand(String input){
        if(input.equals("1")){
            addJokes();
        } else if(input.equals("2")){
            drawJokes();
        } else if(input.equals("3")){
            printJokes();
        }
    }

    public void addJokes(){
        System.out.println("Write the joke to be added:");
        String input = scanner.nextLine();

        jokes.addJoke(input);
    }

    public void drawJokes(){
        System.out.println(jokes.drawJoke());
    }

    public void printJokes(){
        System.out.println("Printing the jokes.");
        jokes.printJokes();
    }
}
