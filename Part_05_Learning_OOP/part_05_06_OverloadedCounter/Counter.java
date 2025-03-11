package Part_05_Learning_OOP.part_05_06_OverloadedCounter;

public class Counter {
    private int startValue;

    public Counter(int startValue){
        this.startValue = startValue;
    }

    public Counter(){
        this.startValue = 0;
    }

    public int value(){
        return this.startValue;
    }

    public void increase(int increaseBy){
        if(increaseBy < 0){
            return;
        }
        this.startValue += increaseBy;
    }

    public void increase(){
        this.startValue += 1;
    }

    public void decrease(int decreaseBy){
        if(decreaseBy < 0){
            return;
        }
        this.startValue -= decreaseBy;
    }

    public void decrease(){
        this.startValue -= 1;
    }
}
