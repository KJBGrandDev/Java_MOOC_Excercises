package OOP_CLASS_ACTIVITIES.SpecializedCarTypes;

public class ElectricCar extends Car {
    private Double batteryLevel;
    private Double batteryCapacity;
    private Double energyConsumption;

    private static final String text_nG = "\u001B[38;5;46m";
    private static final String text_n0 = "\u001B[38;5;214m";
    private static final String text_nR = "\u001B[38;5;197m";
    private static final String text_cR = "\u001B[0m";

    public ElectricCar(String brand, double batteryCapacity, double efficiencyPerKWh){
        super(brand,0,0);
        this.batteryCapacity = batteryCapacity;
        this.energyConsumption = efficiencyPerKWh;

        this.batteryLevel = 0.0;
    }

    public void recharge(Double kwh){
        if(kwh <= 0){
            System.out.println(text_nR + "\nInvalid input! " + text_n0 + "Please give a " + text_nG + "positive value!" + text_cR);

            return;
        }

        if(batteryLevel >= batteryCapacity){
            System.out.println(text_nR + "\nBattery is already" + text_nG +" Full!" + text_cR);
            System.out.println(text_n0 + "Cannot charge anymore!" + text_cR);

            return;
        }

        if((kwh + batteryLevel) > batteryCapacity){
            double overcharged= (this.batteryLevel + kwh) - this.batteryCapacity;
            System.out.println(text_nR + "\nOvercharged! " + text_nG + overcharged + " kWh. " + text_n0 + "wasted!" + text_cR);
            batteryLevel = batteryCapacity;
            System.out.println(text_n0 + "Battery is now " + text_nG + "full!" + text_cR);

        } else {
            this.batteryLevel += kwh;
            System.out.println(text_n0 + "\nSuccessfully charged " + text_nG + kwh + " kWh." + text_n0 + " of power!" + text_cR);

        }
    }

    public void refuel(){
        System.out.println(text_nR + "Cannot Refuel!" + text_n0 + "This is an" + text_nG + " electric" + text_n0 + " car!" + text_cR);
    }

    public void drive(double distance){
        if(distance <= 0){
            System.out.println(text_nR + "\nInvalid distance!" + text_n0 + " Please give a positive " + text_nG + "value!" + text_cR);

        }

        if(batteryLevel == 0){
            System.out.println(text_nR + "\nBattery is Empty!" + text_n0 + " You need to " + text_nG + "recharged" + text_n0 + " the car first!" + text_cR);

            return;
        }

        if(canDrive(distance)){
            double powerToBeUsed = distance / this.energyConsumption;
            batteryLevel -= powerToBeUsed;
            System.out.println(text_n0 + "\nDriving: " + text_nG + distance + text_nG + " km" + text_n0 + "..." + text_cR);
            System.out.println(text_n0 + "Energy Remaining: " + text_nG + this.batteryLevel + "kWh" + text_cR);

        } else {
            System.out.println(text_n0 + "\nDriving: " + text_nG + distance + text_nG + " km" + text_n0 + "..." + text_cR);
            System.out.println(text_nR + "Not enough fuel!" + text_n0 + " You drove " + text_nG + this.estimateRange() + " km" + text_n0 + " until battery emptied" + text_cR);

            batteryLevel = 0.0;
            System.out.println(text_n0 + "Energy Remaining: " + text_nG + this.batteryLevel + "kWh" + text_cR);

        }
    }

    public double getBatteryLevel(){
        return this.batteryLevel;
    }

    public Double getBatteryCapacity() {
        return batteryCapacity;
    }

    public Double getEnergyConsumption() {
        return energyConsumption;
    }

    public boolean canDrive(double distance){
        return this.batteryLevel - (distance / this.energyConsumption) > 0;
    }

    public double estimateRange(){
        return this.batteryLevel * this.energyConsumption;
    }
}
