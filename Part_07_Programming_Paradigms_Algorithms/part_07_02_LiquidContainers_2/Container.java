package Part_07_Programming_Paradigms_Algorithms.part_07_02_LiquidContainers_2;

public class Container {
    private int container;
    private int maxAmount;

    public Container(){
        this.container = 0;
        this.maxAmount = 100;
    }

    public int contains(){
        return this.container;
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
