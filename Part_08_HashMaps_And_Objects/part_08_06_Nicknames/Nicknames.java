package Part_08_HashMaps_And_Objects.part_08_06_Nicknames;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args){
        HashMap<String,String> name = new HashMap<>();

        name.put("matthew","matt");
        name.put("michael","mix");
        name.put("arthur","artie");

        for(String i:name.keySet()){
            System.out.println(i + "'s nickname is " +name.get(i));
        }
    }
}
