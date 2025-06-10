package Part_06_Objects_And_Complex_Programs.part_06_05_SantasWorkshop;

public class Gift {
    private String name;
    private int weight;

    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

    public String toString(){
        return "Gift: " + name + " (" + weight + "kg" + ")";
    }
}
