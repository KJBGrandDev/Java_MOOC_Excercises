package Part_09_Advanced_OOP.Part_09_04_DifferentKindsOfBoxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity){
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Item item){
        int weight = 0;
        for(Item i: items){
            weight += i.getWeight();
        }

        if(weight + item.getWeight() <= this.capacity){
            this.items.add(item);
        }
    }

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            BoxWithMaxWeight.this.add(item);
        }
    }

    public boolean isInBox(Item item){
        for(Item i: items){
            if(i.equals(item)){
                return true;
            }
        }
        return false;
    }
}
