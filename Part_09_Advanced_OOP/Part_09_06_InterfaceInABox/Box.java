package Part_09_Advanced_OOP.Part_09_06_InterfaceInABox;

import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> packables;
    private double capacity;
    private double currentWeight;

    public Box(double capacity){
        this.packables = new ArrayList<>();
        this.capacity = capacity;
        this.currentWeight = 0;
    }

    public void add(Packable packable){
        if(packable.weight() + this.currentWeight <= this.capacity){
            this.currentWeight += packable.weight();
            packables.add(packable);
        }
    }

    public double weight(){
        double weight = 0;
        for(Packable i: this.packables){
            weight += i.weight();
        }
        return weight;
    }

    public String toString(){
        return String.format("Box: %d items, total weight %f kg",packables.size(),this.currentWeight);
    }
}
