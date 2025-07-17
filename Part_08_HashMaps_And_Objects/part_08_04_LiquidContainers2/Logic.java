package Part_08_HashMaps_And_Objects.part_08_04_LiquidContainers2;

public class Logic {
    private Container first;
    private Container second;

    public Logic(Container first, Container second){
        this.first = first;
        this.second = second;
    }

    public void add(int amount){
        first.add(amount);
    }

    public void move(int amount){
        if(amount > first.contains()){
            second.add(first.contains());
        } else {
            first.remove(amount);
            second.add(amount);
        }

        if(second.contains() > second.getMaxAmount()){
            second.add(second.getMaxAmount());
        }
    }

    public void remove(int amount){
        second.remove(amount);
    }

    public String toString(){
        String firstString = "First: " + first;
        String secondString = "Second: " + second;

        return firstString + "\n" + secondString;
    }
}
