package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_11_WageOrder;

public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    public int compareTo(Human human){
        if(this.wage < human.wage){
            return -1;
        } else if(this.wage == human.wage){
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return name + " " + wage;
    }
}
