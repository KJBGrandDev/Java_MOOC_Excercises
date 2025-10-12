package Part_09_Advanced_OOP.Part_09_10_OnlineStore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;
    private Set<String> productName;

    public Warehouse(){
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
        this.productName = new HashSet<>();
    }

    public void addProduct(String product, int price, int stock){
        productPrice.put(product,price);
        productStock.put(product,stock);

        productName.add(product);
    }

    public int price(String product){
        if(!productPrice.containsKey(product)){
            return -99;
        }
        return productPrice.get(product);
    }

    public int stock(String product){
        if(!productStock.containsKey(product)){
            return 0;
        }
        return productStock.get(product);
    }

    public boolean take(String product){
        if(productStock.containsKey(product)){
            if(productStock.get(product) != 0){
                productStock.compute(product, (k, stock) -> stock - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products(){
        return productName;
    }
}
