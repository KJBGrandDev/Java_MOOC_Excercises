package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_08_Weighting;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + ": (" + this.weight + " kg)";
    }
}