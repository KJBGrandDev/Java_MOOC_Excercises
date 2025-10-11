package Part_09_Advanced_OOP.Part_09_04_DifferentKindsOfBoxes;

import java.util.ArrayList;

public abstract class Box {

    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}
