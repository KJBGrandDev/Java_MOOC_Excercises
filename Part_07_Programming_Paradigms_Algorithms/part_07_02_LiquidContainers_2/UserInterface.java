package Part_07_Programming_Paradigms_Algorithms.part_07_02_LiquidContainers_2;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Container first;
    private Container second;

    public UserInterface(Scanner scanner, Container first, Container second){
        this.scanner = scanner;
        this.first = first;
        this.second = second;
    }

    public void start(){
        initialPrompt();
    }

    public void initialPrompt(){
        while(true){
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scanner.nextLine();

            if(input.equals("quit")){
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            processCommand(command,amount);
        }
    }

    public void processCommand(String command, int amount){
        switch(command){
            case "add":{
                this.add(amount);
                break;
            }
            case "move":{
                this.move(amount);
                break;
            }
            case "remove":{
                this.remove(amount);
                break;
            }
        }
    }

    public void add(int amount){
        first.add(amount);
    }

    public void move(int amount){
        if(amount > first.contains()){
            amount = first.contains();
        }
        first.remove(amount);
        second.add(amount);

        if(second.contains() > 100){
            second.remove(second.contains());
            second.add(100);
        }
    }

    public void remove(int amount){
        second.remove(amount);
    }
}
