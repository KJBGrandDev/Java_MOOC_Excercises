package OOP_CLASS_ACTIVITIES.ShippingSystem;

public class ExpressShipment extends Shipment{
    private String priorityLevel;
    private double priorityFee;

    public ExpressShipment(String trackingNumber, String sender, String receiver, double weight, double baseRate, double distanceKm, String priorityLevel){
        super(trackingNumber,sender,receiver,weight,baseRate,distanceKm);
        this.priorityLevel = priorityLevel.toLowerCase();
    }

    public double calculateCost(){
        switch(this.priorityLevel){
            case "normal":{
                this.priorityFee = 0;
                break;
            }
            case "high":{
                this.priorityFee = 200;
                break;
            }
            case "rush":{
                this.priorityFee = 500;
                break;
            }
            default:{
                this.priorityFee = 0;
                break;
            }
        }

        return super.calculateCost() + priorityFee;
    }

    public boolean isHighPriority(){
        if(priorityLevel.equals("high") || priorityLevel.equals("rush")){
            return true;
        }
        return false;
    }

    public int getEstimatedDeliveryDays(){
        int averageDistancePerDay = 800;
        return (int) Math.ceil(super.getDistanceKm() / averageDistancePerDay);
    }
}
