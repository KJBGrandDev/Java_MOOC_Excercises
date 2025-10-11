package Part_09_Advanced_OOP.Part_09_04_DifferentKindsOfBoxes;

import java.util.ArrayList;

public class MisplacingBox {
    private ArrayList<Item> items;

    public MisplacingBox(){
        this.items = new ArrayList<>();
    }

    public void add(Item item){
        items.add(item);
    }

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            MisplacingBox.this.add(item);
        }
    }

    public boolean isInBox(Item item){
        return false;
    }
}
