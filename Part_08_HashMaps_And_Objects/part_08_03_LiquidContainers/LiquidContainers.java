package Part_08_HashMaps_And_Objects.part_08_03_LiquidContainers;

import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LiquidComputation newComputation = new LiquidComputation();

        while(true){
            System.out.println("First: " + newComputation.getFirstContainer() + "/100");
            System.out.println("Second: " + newComputation.getSecondContainer() + "/100");

            String input = scan.nextLine();

            if(input.equals("quit")){
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            switch (command){
                case "add":{
                    newComputation.add(amount);
                    break;
                }
                case "move":{
                    newComputation.move(amount);
                    break;
                }
                case "remove":{
                    newComputation.remove(amount);
                    break;
                }
            }
        }
    }
}
