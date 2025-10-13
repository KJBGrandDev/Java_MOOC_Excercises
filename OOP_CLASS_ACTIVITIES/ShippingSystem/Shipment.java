package OOP_CLASS_ACTIVITIES.ShippingSystem;

public class Shipment {
    private String trackingNumber;
    private String sender;
    private String receiver;
    private double weight;
    private double baseRate;
    private double distanceKm;
    private boolean delivered;

    public Shipment(String trackingNumber, String sender, String receiver, double weight, double baseRate, double distanceKm){
        this.trackingNumber = trackingNumber;
        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
        this.baseRate = baseRate;
        this.distanceKm = distanceKm;
    }

    public double calculateCost(){
        return this.weight * baseRate;
    }

    public void markDelivered(){
        delivered = true;
    }

    public String getDeliveryStatus(){
        if(this.delivered){
            return "Delivered";
        }

        return "In transit";
    }

    public int getEstimatedDeliveryDays(){
        //Standard Shipment
        int averageDistancePerDay = 500; //Km - Day
        return (int) Math.ceil(this.distanceKm / averageDistancePerDay);
    }

    public String getDetails(){
        return "Tracking Number: " + trackingNumber +
                "\nSender: " + sender +
                "\nReceiver: " + receiver +
                "\nCost: $ " + this.calculateCost() +
                "\nStatus: " + this.getDeliveryStatus();
    }

    //Getters
    public double getWeight(){
        return this.weight;
    }

    public double getDistanceKm(){
        return this.distanceKm;
    }

    public double getBaseRate(){
        return this.baseRate;
    }

    //Setters
    public void setWeight(double weight){
        if(weight <= 0){
            System.out.println("Invalid Input! Please give a positive value");
        } else {
            this.weight = weight;
        }
    }

    public void setDistanceKm(double distanceKm){
        if(distanceKm <= 0){
            System.out.println("Invalid Input! Please give a positive value");
        } else {
            this.distanceKm = distanceKm;
        }
    }

    public void setBaseRate(double baseRate){
        if(baseRate <= 0){
            System.out.println("Invalid Input! Please give a positive value");
        } else {
            this.baseRate = baseRate;
        }
    }
}
