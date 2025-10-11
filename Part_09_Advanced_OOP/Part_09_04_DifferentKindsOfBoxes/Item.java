package Part_09_Advanced_OOP.Part_09_04_DifferentKindsOfBoxes;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Item other = (Item) obj;
        return this.name.equals(other.name);
    }

    public int hashCode(){
        return this.name.hashCode();
    }
}
