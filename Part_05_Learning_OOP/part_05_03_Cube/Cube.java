package Part_05_Learning_OOP.part_05_03_Cube;

public class Cube {
    //instance variables
    private int edgeLength;

    //constructor
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }

    //methods
    public int volume(){
        return (edgeLength * edgeLength) * edgeLength;
    }

    public String toString(){
        return "The length of the edge is " + edgeLength + " and the volume " + this.volume();
    }
}
