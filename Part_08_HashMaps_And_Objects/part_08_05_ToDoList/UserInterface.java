package Part_08_HashMaps_And_Objects.part_08_05_ToDoList;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list,Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){

        while (true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }

            commandProcessor(input);
        }
    }

    public void commandProcessor(String command){
        switch (command){
            case "add":{
                System.out.print("To add: ");
                String input = scanner.nextLine();

                list.add(input);
                break;
            }
            case "list":{
                list.print();
                break;
            }
            case "remove":{
                System.out.print("Which one is removed? ");
                int input = Integer.parseInt(scanner.nextLine());

                list.remove(input);
                break;
            }
        }
    }
}
