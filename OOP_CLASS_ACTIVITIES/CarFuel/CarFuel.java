package OOP_CLASS_ACTIVITIES.CarFuel;

public class CarFuel {
    private double fuelCapacity;
    private double currentFuel;
    private double fuelEfficiency;

    private static final String text_nG = "\u001B[38;5;46m";
    private static final String text_n0 = "\u001B[38;5;214m";
    private static final String text_nR = "\u001B[38;5;197m";
    private static final String text_cR = "\u001B[0m";

    public CarFuel(double fuelCapacity,double fuelEfficiency){
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = 0;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getFuelCapacity(){
        return fuelCapacity;
    }

    public double getFuelEfficiency(){
        return fuelEfficiency;
    }


    public void refuel(double liters){
         if(liters <= 0){
            System.out.println(text_nR + "\nInvalid input! " + text_n0 + "Please give a " + text_nG + "positive value!" + text_cR);

            pause(4000);
            return;
        }

        if(this.currentFuel + liters > this.fuelCapacity){
            double overflow = (this.currentFuel + liters) - this.fuelCapacity;
            System.out.println(text_nR + "\nOverflow! " + text_nG + overflow + " Ltr. " + text_n0 + "wasted!" + text_cR);
            currentFuel = fuelCapacity;
            System.out.println(text_n0 + "Fuel tank is now " + text_nG + "full!" + text_cR);

            pause(4000);
        } else{
            this.currentFuel += liters;
            System.out.println(text_n0 + "\nSuccessfully refueled " + text_nG + liters + " Ltr." + text_n0 + " of fuel!" + text_cR);

            pause(4000);
        }
    }

    public void drive(double distance){
        if(currentFuel == 0){
            System.out.println(text_nR + "\nFuel Tank Empty!" + text_n0 + " You need to " + text_nG + "refuel" + text_n0 + " the car first!" + text_cR);

            pause(4000);
            return;
        }

        if(distance <= 0){
            System.out.println(text_nR + "\nInvalid distance!" + text_n0 + " Please give a positive " + text_nG + "value!" + text_cR);

            pause(4000);
        }

        if(canDrive(distance)){
            double fuelToBeUsed = distance / this.fuelEfficiency;
            currentFuel -= fuelToBeUsed;
            System.out.println(text_n0 + "\nDriving: " + text_nG + distance + text_nG + " km" + text_n0 + "..." + text_cR);
            System.out.println(text_n0 + "Fuel left: " + text_nG + this.currentFuel + "L" + text_cR);

            pause(4000);
        } else {
            System.out.println(text_n0 + "\nDriving: " + text_nG + distance + text_nG + " km" + text_n0 + "..." + text_cR);
            System.out.println(text_nR + "Not enough fuel!" + text_n0 + " You drove " + text_nG + this.estimateRange() + " km" + text_n0 + " until tank emptied" + text_cR);

            currentFuel = 0;
            System.out.println(text_n0 + "Fuel left: " + text_nG + this.currentFuel + "L" + text_cR);

            pause(4000);
        }
    }

    public double getCurrentFuel(){
        return currentFuel;
    }

    public boolean canDrive(double distance){
        return this.currentFuel - (distance / this.fuelEfficiency) > 0;
    }

    public double estimateRange(){
        return currentFuel * fuelEfficiency;
    }

    public  void pause(int millisecond){
        System.out.println(text_n0 + "\nGoing back to dashboard after " + text_nG + "4 "+ text_n0 + "seconds..." + text_cR);

        try{
            Thread.sleep(millisecond);
        } catch (InterruptedException e ){
            Thread.currentThread().interrupt();
        }
    }
}
