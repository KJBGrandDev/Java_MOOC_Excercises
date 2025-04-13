package Part_05_Learning_OOP.part_05_04_Fitbyte;

public class Fitbyte {
    //instance variable
    private int age;
    private int restingHeartRate;

    //Constructor
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    //Methods
    public double targetHeartRate(double percentageOfMaximum) {
        return (206.3 - (0.711 * this.age) - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
    }
}
