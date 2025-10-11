package Part_09_Advanced_OOP.Part_09_04_DifferentKindsOfBoxes;

import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> items;

    public OneItemBox(){
        this.items = new ArrayList<>();
    }

    public void add(Item item){
        if(items.isEmpty()){
            this.items.add(item);
        }
    }

    public void add(ArrayList<Item> items){
        for(Item item : items){
            if(this.items.isEmpty()){
                OneItemBox.this.add(item);
            }
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
