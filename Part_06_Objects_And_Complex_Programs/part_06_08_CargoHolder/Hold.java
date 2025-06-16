package Part_06_Objects_And_Complex_Programs.part_06_08_CargoHolder;

import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private int totalWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){

        if((totalWeight + suitcase.totalWeight()) <= maximumWeight){
            suitcases.add(suitcase);
            totalWeight += suitcase.totalWeight();
        }
    }

    public void printItems(){
        for(Suitcase suitcase: suitcases){
            suitcase.printItems();
        }
    }

    public String toString(){
        int totalWeight = 0;

        for(Suitcase suitcase: suitcases){
            totalWeight += suitcase.totalWeight();
        }

        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
}
