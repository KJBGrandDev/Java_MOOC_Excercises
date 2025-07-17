package Part_08_HashMaps_And_Objects.part_08_04_LiquidContainers2;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Logic logic;

    public UserInterface(Scanner scanner, Logic logic){
        this.scanner = scanner;
        this.logic = logic;
    }

    public void start(){
        while(true){
            System.out.println(logic);
            String input = scanner.nextLine();

            if(input.equals("quit")){
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            commandProcessor(command,amount);
        }
    }

    public void commandProcessor(String command,int amount){
        switch(command){
            case "add":{
                logic.add(amount);
                break;
            }
            case "move":{
                logic.move(amount);
                break;
            }
            case "remove":{
                logic.remove(amount);
                break;
            }
        }
    }
}
