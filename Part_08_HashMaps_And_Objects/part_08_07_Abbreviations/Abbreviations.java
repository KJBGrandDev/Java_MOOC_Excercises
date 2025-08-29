package Part_08_HashMaps_And_Objects.part_08_07_Abbreviations;

import java.util.HashMap;

public class Abbreviations {
    HashMap<String,String> list;
    private String abbreviation;
    private String explanation;

    public Abbreviations(){
        this.list = new HashMap<>();
        this.abbreviation = "";
        this.explanation = "";
    }

    public void addAbbreviation(String abbreviation, String explanation){
        list.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return list.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        return list.get(abbreviation);
    }
}
