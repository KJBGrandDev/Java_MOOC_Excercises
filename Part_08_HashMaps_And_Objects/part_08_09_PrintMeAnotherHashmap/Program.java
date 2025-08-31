package Part_08_HashMaps_And_Objects.part_08_09_PrintMeAnotherHashmap;

import java.util.HashMap;

public class Program {
    public static void main(String[] args){
        HashMap<String,Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811,"Test"));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "Test"));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap,"prejud");
    }

    public static void printValues(HashMap<String,Book> hashmap){
        for(Book i: hashmap.values()){
            System.out.println(i);
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for(Book i: hashmap.values()){
            if(i.getName().contains(text)){
                System.out.println(i);
            }
        }
    }
}
