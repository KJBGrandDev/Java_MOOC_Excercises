package Part_05_Learning_OOP.part_05_14_Archive;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while(true){
            System.out.println("Identifier (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }

            System.out.println("Name (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            Item item = new Item(identifier,name);
            if(!(items.contains(item))){
                items.add(item);
            }
        }
        System.out.println("==Items==");
        for(Item iterateItem: items){
            System.out.println(iterateItem.getIdentifier() + ": " + iterateItem.getName());
        }
    }
}
