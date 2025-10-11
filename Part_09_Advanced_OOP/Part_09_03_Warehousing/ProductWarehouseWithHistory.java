package Part_09_Advanced_OOP.Part_09_03_Warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);
        this.history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        history.add(initialBalance);
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount){
        double taken = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return taken;
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history);
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }

    public String history(){
        return history.toString();
    }
}
