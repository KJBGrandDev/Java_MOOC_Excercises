package Part_09_Advanced_OOP.Part_09_10_OnlineStore;

import java.util.Scanner;
public class Store {
    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner){
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer){
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store: " + customer);
        System.out.println("Our selection: ");

        for(String product: this.warehouse.products()){
            System.out.println(product);
        }

        while(true){
            System.out.println("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if(product.isEmpty()){
                break;
            }

            if(warehouse.take(product)){
                int price = warehouse.price(product);
                cart.add(product,price);
            } else{
                System.out.println("Product Unavailable!");
            }
        }

        System.out.println("Your shopping cart contents: ");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
