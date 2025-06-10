package Part_06_Objects_And_Complex_Programs.part_06_06_LongestInCollection;


import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String getName(){
        return this.name;
    }

    public String longest(){
        String longest = "";
        if(elements.isEmpty()){
            longest = null;
            return "Longest: " + longest;
        }
        for(String i: elements){
            if(longest.length() < i.length()){
                longest = i;
            }
        }
        return "Longest: " + longest;
    }
}

