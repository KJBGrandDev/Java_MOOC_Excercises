package Part_05_Learning_OOP.part_05_01_OneMinute;

public class ClockHand {
    private int limit;
    private int value;

    public ClockHand(int limit){
        this.limit = limit;
        this.value = 0;
    }

    public void advance(){
        this.value = this.value + 1;
        if(this.value >= this.limit){
            this.value = 0;
        }
    }

    public int getValue(){
        return this.value;
    }

    public String toString(){
        if(this.value < 10){
            return "0" + this.value;
        }
        return "" + this.value;
    }
}
