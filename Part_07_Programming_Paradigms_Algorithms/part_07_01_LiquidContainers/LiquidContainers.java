package Part_07_Programming_Paradigms_Algorithms.part_07_01_LiquidContainers;

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int maxValue = 100;

        while (true) {
            System.out.println("First: " + first + "/" + maxValue);
            System.out.println("Second: " + second + "/" + maxValue);

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("quit")) {
                break;
            }

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if(command.equals("add")){
                if(amount > 0){
                    if(amount + first > maxValue){
                        first = maxValue;
                    } else {
                        first += amount;
                    }
                }
            }

            if(command.equals("move")){
                if(amount > 0 && first != 0){
                    if(amount + second <= maxValue){
                        if(amount > first){
                            second += first;
                            first = 0;
                        } else {
                            first -= amount;
                            second += amount;
                        }
                    } else {
                        if(second + amount >= maxValue){
                            int minus = (maxValue - second);

                            if(amount >= minus){
                                first -= minus;
                            } else {
                                first -= amount;
                            }
                            second = maxValue;
                        }
                    }
                }
            }

            if(command.equals("remove")){
                if(amount > 0 && amount <= second){
                    second -= amount;
                }
            }
        }
    }
}
