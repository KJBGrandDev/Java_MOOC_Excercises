package Part_09_Advanced_OOP.Part_09_09_SetAsAMethodParameter;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));
    }

    public static int returnSize(Set<String> set){
        return set.size();
    }
}
