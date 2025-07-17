package Part_08_HashMaps_And_Objects.part_08_04_LiquidContainers2;

public class Container {
    private int container;
    private final int  maxAmount;

    public Container(){
        this.container = 0;
        this.maxAmount = 100;
    }

    public int contains(){
        return container;
    }

    public int getMaxAmount(){
        return maxAmount;
    }

    public void add(int amount){
        if(amount > 0){
            if(container + amount < maxAmount){
                container += amount;
            } else {
                container = maxAmount;
            }
        }
    }

    public void remove(int amount){
        if(amount > 0){
            if(container - amount <= 0){
                container = 0;
            } else {
                container -= amount;
            }
        }
    }

    public String toString(){
        return container + "/" + maxAmount;
    }
}
