package Part_06_Objects_And_Complex_Programs.part_06_09_SimpleDictionary;

import java.util.Scanner;

public class TextUI_002 {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI_002(Scanner scanner,SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){
        while(true){
            System.out.println("Command:");
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            processCommand(input);
        }
    }

    public void processCommand(String command){
        if(command.equals("add")){
            add();
        } else if(command.equals("search")){
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add(){
        System.out.println("Word:");
        String givenWord = scanner.nextLine();
        System.out.println("Translation:");
        String givenTranslation = scanner.nextLine();

        dictionary.add(givenWord,givenTranslation);
    }

    public void search(){
        System.out.println("To be translated:");
        String toBeTranslated = scanner.nextLine();

        if(dictionary.translate(toBeTranslated) == null){
            System.out.println("Word " + toBeTranslated + " was not found");
        } else {
            System.out.println("Translation: " + dictionary.translate(toBeTranslated));
        }
    }
}
