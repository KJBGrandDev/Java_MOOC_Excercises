package OOP_CLASS_ACTIVITIES.ShippingSystem;

public class ShipmentInput {
    private String trackingNumber;
    private String sender;
    private String receiver;
    private double weight;
    private double baseRate;
    private double distanceKm;
    private boolean delivered;

    public ShipmentInput(String trackingNumber, String sender, String receiver,
                         double weight, double baseRate, double distanceKm, boolean delivered) {
        this.trackingNumber = trackingNumber;
        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
        this.baseRate = baseRate;
        this.distanceKm = distanceKm;
        this.delivered = delivered;
    }

    // Getters
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public double getWeight() {
        return weight;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public boolean isDelivered() {
        return delivered;
    }
}
