package Part_09_Advanced_OOP.Part_09_04_DifferentKindsOfBoxes;

public class Main {
    public static void main(String[] args){
        Box box = new OneItemBox();
        box.add(new Item("a", 1));
        box.add(new Item("b", 2));
        box.add(new Item("c", 2));
        box.isInBox(new Item("b"));
    }
}
