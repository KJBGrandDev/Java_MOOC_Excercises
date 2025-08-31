package Part_08_HashMaps_And_Objects.part_08_08_PrintMeMyHashmap;

import java.util.HashMap;

public class Program {
    public static void main(String[] args){
        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        printKeysWhere(hashmap,"i");
        printValuesOfKeysWhere(hashmap,".e");
    }

    public static void printKeys(HashMap<String, String> hashMap){
        for(String i: hashMap.keySet()){
            System.out.println(i);
        }
        System.out.println("---");
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for(String i: hashmap.keySet()){
            if(i.contains(text)){
                System.out.println(i);
            }
        }
        System.out.println("---");
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for(String i: hashmap.keySet()){
            if(i.contains(text)){
                System.out.println(hashmap.get(i));
            }
        }
        System.out.println("---");
    }
}
