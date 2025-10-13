package Part_09_Advanced_OOP.Part_09_03_Warehousing;

import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history = new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    public double maxValue(){
        double largest = 0.0;
        if(this.history.isEmpty()){
            return 0.0;
        } else {
            largest = history.get(0);
            for(double i: this.history){
                if(i > largest){
                    largest = i;
                }
            }
        }

        return largest;
    }

    public double minValue(){
        double lowest = 0.0;
        if(this.history.isEmpty()){
            return 0.0;
        } else {
            lowest = history.get(0);
            for(double i: this.history){
                if(i < lowest){
                    lowest = i;
                }
            }
        }

        return lowest;
    }

    public double average(){
        double rawSum = 0.0;
        if(this.history.isEmpty()){
            return 0.0;
        } else {
            for(double i: this.history){
                rawSum += i;
            }
        }

        double average = rawSum / this.history.size();
        return average;
    }

    public String toString(){
        return history.toString();
    }
}
