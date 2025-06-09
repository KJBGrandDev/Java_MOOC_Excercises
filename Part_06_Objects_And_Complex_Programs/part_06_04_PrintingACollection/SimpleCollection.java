package Part_06_Objects_And_Complex_Programs.part_06_04_PrintingACollection;


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

    public String toString(){
        StringBuilder list = new StringBuilder();
        String printOut = "";
        for(int i = 0; i < elements.size(); i++){
            list.append(elements.get(i));
            if(i < elements.size() - 1){
                list.append("\n");
            }
        }
        if(elements.isEmpty()){
            printOut += "The collection " + name + " is empty.";
            return printOut;
        } else {
            printOut += "The collection " + name + " has " + elements.size() + (elements.size() == 1 ? " element" : " elements");
            return printOut + "\n" + list;
        }
    }
}

