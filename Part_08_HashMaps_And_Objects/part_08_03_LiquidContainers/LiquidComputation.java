package Part_08_HashMaps_And_Objects.part_08_03_LiquidContainers;

public class LiquidComputation {
    private int firstContainer;
    private int secondContainer;

    public LiquidComputation(){
        this.firstContainer = 0;
        this.secondContainer = 0;
    }

    public int getFirstContainer(){
        return firstContainer;
    }

    public int getSecondContainer(){
        return secondContainer;
    }

    public void add(int amount){
        if(amount > 0){
            if(firstContainer + amount < 100){
                firstContainer += amount;
            } else {
                firstContainer = 100;
            }
        }
    }

    public void move(int amount){
        if(amount > 0 && firstContainer != 0){
            if(firstContainer - amount < 0){
                secondContainer = firstContainer;
                firstContainer = 0;
            } else{
                firstContainer -= amount;
                secondContainer += amount;
            }

            if(secondContainer > 100){
                secondContainer = 100;
            }
        }
    }

    public void remove(int amount){
        if(amount > 0){
            if(secondContainer - amount > 0){
                secondContainer -= amount;
            } else {
                secondContainer = 0;
            }
        }
    }
}
