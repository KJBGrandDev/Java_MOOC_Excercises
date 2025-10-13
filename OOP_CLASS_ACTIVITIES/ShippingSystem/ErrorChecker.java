package OOP_CLASS_ACTIVITIES.ShippingSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorChecker {
    private String errorInput;
    private String errroInputBoolean;

    public ErrorChecker(){
        this.errorInput = "Invalid Input! Please give a proper value!";
        this.errroInputBoolean = "Invalid Input! Please answer in [True / False] only!";
    }

    public int errorInt(Scanner scanner){
        while(true){
            try{
                return Integer.parseInt(scanner.nextLine());
            } catch(NumberFormatException e){
                System.out.println(this.errorInput);
            }
        }
    }

    public double errorDouble(Scanner scanner){
        while(true){
            try{
                return Double.parseDouble(scanner.nextLine());
            } catch(NumberFormatException e){
                System.out.println(this.errorInput);
            }
        }
    }

    public boolean errorBoolean(Scanner scanner){
        while (true){
            try {
                return Boolean.parseBoolean(scanner.nextLine());
            } catch (InputMismatchException e){
                System.out.println(errroInputBoolean);
            }
        }
    }
}
