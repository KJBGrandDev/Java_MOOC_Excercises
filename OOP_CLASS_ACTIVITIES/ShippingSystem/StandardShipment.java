package OOP_CLASS_ACTIVITIES.ShippingSystem;

public class StandardShipment extends Shipment {
    private double insuranceFee;

    public StandardShipment(String trackingNumber, String sender, String receiver, double weight, double baseRate, double distanceKm, double insuranceFee){
        super(trackingNumber,sender,receiver,weight,baseRate,distanceKm);
        this.insuranceFee = insuranceFee;
    }

    public double calculateCost(){
        return super.calculateCost() + this.insuranceFee;
    }

    public String getDetails(){
        return super.getDetails() + "\nInsurance Fee: " + this.insuranceFee + "\n";
    }
}
