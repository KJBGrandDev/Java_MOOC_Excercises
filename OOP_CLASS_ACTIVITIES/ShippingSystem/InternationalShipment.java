package OOP_CLASS_ACTIVITIES.ShippingSystem;

public class InternationalShipment extends Shipment{
    private double customsFee;
    private String destinationCountry;

    public InternationalShipment(String trackingNumber, String sender, String receiver, double weight, double baseRate, double distanceKm, double customsFee, String destinationCountry){
        super(trackingNumber,sender,receiver,weight,baseRate,distanceKm);
        this.customsFee = customsFee;
        this.destinationCountry = destinationCountry;
    }

    public double calculateCost(){
        return super.calculateCost() + customsFee;
    }

    public boolean requiresCustomsDeclaration(){
        return super.getWeight() > 2.0;
    }

    public int getEstimatedDeliveryDays(){
        int averageDistancePerDay = 400;
        return (int) Math.ceil(super.getDistanceKm() / averageDistancePerDay) + 2; // +2 for customs
    }

    public double getCustomsFee(){
        return this.customsFee;
    }

    public String getDestinationCountry(){
        return this.destinationCountry;
    }
}
