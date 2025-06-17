package Part_06_Objects_And_Complex_Programs.part_06_09_SimpleDictionary;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){
        boolean system = true;

        while(system){
            System.out.println("Command: ");
            String input = scanner.nextLine();

            switch (input){
                case "end":{
                    System.out.println("Bye bye!");
                    system = false;
                    break;
                }
                case "add":{
                    System.out.println("Word:");
                    String givenWord = scanner.nextLine();
                    System.out.println("Translation:");
                    String givenTranslation = scanner.nextLine();

                    dictionary.add(givenWord,givenTranslation);
                    break;
                }
                case "search":{
                    System.out.println("To be translated:");
                    String toBeTranslated = scanner.nextLine();

                    if(dictionary.translate(toBeTranslated) == null){
                        System.out.println("Word " + toBeTranslated + " was not found");
                    } else {
                        System.out.println("Translation: " + dictionary.translate(toBeTranslated));
                    }
                    break;
                }
                default:{
                    System.out.println("Unknown command");
                    break;
                }
            }
        }
    }
}
