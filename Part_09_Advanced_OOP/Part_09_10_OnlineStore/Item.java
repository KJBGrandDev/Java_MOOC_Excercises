package Part_09_Advanced_OOP.Part_09_10_OnlineStore;

public class Item {
    private String productName;
    private int quantity;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.productName = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.unitPrice * this.quantity;
    }

    public void increaseQuantity(){
        this.quantity += 1;
    }

    public String toString(){
        return String.format("%s: %d",this.productName, this.quantity);
    }
}
