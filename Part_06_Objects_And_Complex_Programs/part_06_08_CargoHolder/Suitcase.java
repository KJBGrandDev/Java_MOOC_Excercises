package Part_06_Objects_And_Complex_Programs.part_06_08_CargoHolder;

import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        int totalWeight = 0;
        for(Item itemWeight: items){
            totalWeight += itemWeight.getWeight();
        }

        if((totalWeight + item.getWeight()) <= maximumWeight){
            items.add(item);
        }
    }

    public void printItems(){
        for(Item item: items){
            System.out.println(
                    item.getName() + " (" + item.getWeight() + " kg)"
            );
        }
    }

    public int totalWeight(){
        int totalWeight = 0;

        for(Item item: items){
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }

        Item heaviestItem = items.get(0);

        for(Item item: items){
            if(heaviestItem.getWeight() < item.getWeight()){
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    public String toString(){
        int totalWeight = 0;

        for(Item item: items){
            totalWeight += item.getWeight();
        }

        if(items.isEmpty()){
            return "no items (0 kg)";
        } else {
            return items.size() + (items.size() > 1 ? " items (" : " item (") + totalWeight + " kg)";
        }
    }
}
