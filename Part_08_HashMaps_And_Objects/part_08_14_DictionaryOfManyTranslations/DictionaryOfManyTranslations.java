package Part_08_HashMaps_And_Objects.part_08_14_DictionaryOfManyTranslations;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> newHashmap;

    public DictionaryOfManyTranslations(){
        this.newHashmap = new HashMap<>();
    }

    public void add(String word, String translation){
        this.newHashmap.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> list = newHashmap.get(word);
        list.add(translation);
    }

    public ArrayList<String> translate(String word){
        if(newHashmap.containsKey(word)){
            return newHashmap.get(word);
        }
        newHashmap.put(word, new ArrayList<>());
        return newHashmap.get(word);
    }

    public void remove(String word){
        newHashmap.remove(word);
    }
}
