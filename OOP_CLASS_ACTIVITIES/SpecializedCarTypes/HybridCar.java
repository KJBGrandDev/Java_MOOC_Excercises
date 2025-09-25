package OOP_CLASS_ACTIVITIES.SpecializedCarTypes;

public class HybridCar extends Car {
    private Double batteryLevel;
    private Double batteryCapacity;
    private Double energyConsumption;

    private static final String text_nG = "\u001B[38;5;46m";
    private static final String text_n0 = "\u001B[38;5;214m";
    private static final String text_nR = "\u001B[38;5;197m";
    private static final String text_cR = "\u001B[0m";

    public HybridCar(String brand, double fuelCapacity, double fuelEfficiency, double batteryCapacity, double efficiencyPerkWh){
        super(brand,fuelCapacity,fuelEfficiency);

        this.batteryCapacity = batteryCapacity;
        this.energyConsumption = efficiencyPerkWh;

        this.batteryLevel = 0.0;
    }

    public void recharge(double kwh){
        if(kwh <= 0){
            System.out.println("\nInvalid input! " + text_n0 + "Please give a " + text_nG + "positive value!" + text_cR);

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

    public void drive(double distance){
        if(distance <= 0){
            System.out.println(text_nR + "\nInvalid distance!" + text_n0 + " Please give a positive " + text_nG + "value!" + text_cR);

        }

        if(getCurrentFuel() == 0 && batteryLevel == 0){
            System.out.println(text_nR + "\nBoth Fuel Tank and Battery is Empty!" + text_n0 + " You need to " + text_nG + "recharged " + text_n0 + "or " + text_nG + "refuel " + text_n0 + "the car first!" + text_cR);
        }
        if(distance <= estimateRange()){
            double fuelRange = super.estimateRange();
            double batteryRange = this.batteryLevel * this.energyConsumption;
            if(super.getCurrentFuel() > 0 && fuelRange >= distance){
                super.drive(distance);
                System.out.println(text_n0 + "Energy Remaining: " + text_nG + this.batteryLevel + "kWh" + text_cR);
            } else if(super.getCurrentFuel() > 0 && distance > fuelRange && batteryLevel > 0){
                System.out.println(text_n0 + "Overall Distance: " + text_nG + distance + text_n0 + " km...");
                super.drive(fuelRange);

                System.out.println(text_n0 + "\nUsing battery for Excess distance!");
                double remainingDistance = distance - fuelRange;
                this.batteryLevel -= (remainingDistance / this.energyConsumption);
                System.out.println(text_n0 + "\nDriving: " + text_nG + remainingDistance + " km...");
                System.out.println(text_n0 + "Energy Remaining: " + text_nG + this.batteryLevel + " kWh" + text_cR);
            } else if(super.getCurrentFuel() == 0 && this.batteryLevel > 0 && distance < batteryRange){
                System.out.println(text_n0 + "\nDriving: " + text_nG + distance+ " km...");
                this.batteryLevel -= (distance/ this.energyConsumption);
                System.out.println(text_n0 + "Energy Remaining: " + text_nG + this.batteryLevel + " kWh" + text_cR);
            }
        } else {
            super.drive(distance);

            this.batteryLevel = 0.0;
            System.out.println(text_n0 + "Energy Remaining: " + text_nG + this.batteryLevel + " kWh" + text_cR);
        }

    }

    public double getBatteryLevel(){
        return this.batteryLevel;
    }

    public double getBatteryCapacity(){
        return this.batteryCapacity;
    }

    public double estimateRange(){
        return (getCurrentFuel() * getFuelEfficiency()) + (batteryLevel * energyConsumption);
    }
}
