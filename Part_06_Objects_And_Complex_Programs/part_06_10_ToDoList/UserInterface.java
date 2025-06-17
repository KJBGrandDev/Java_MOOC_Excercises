package Part_06_Objects_And_Complex_Programs.part_06_10_ToDoList;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }

    public void start(){
        while(true){
            System.out.println("Command:");
            String input = scanner.nextLine();

            if(input.equals("stop")){
                break;
            }
            processCommand(input);
        }
    }

    public void processCommand(String input){
        if(input.equals("add")){
            add();
        } else if (input.equals("list")){
            list();
        } else if (input.equals("remove")){
            remove();
        }
    }

    public void add(){
        System.out.println("To add:");
        String input = scanner.nextLine();

        list.add(input);
    }

    public void list(){
        list.print();
    }

    public void remove(){
        System.out.println("Which one is removed?");
        int input = Integer.parseInt(scanner.nextLine());

        list.remove(input);
    }
}
