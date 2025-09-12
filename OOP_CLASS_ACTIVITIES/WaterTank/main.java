package OOP_CLASS_ACTIVITIES.WaterTank;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String text_nG = "\u001B[38;5;46m"; //NeonGreen - For Highlighting
        String text_nO = "\u001B[38;5;214m"; //NeonOrange - For standard UI elements
        String text_nC = "\u001B[38;5;87m"; //NeonCyan - For normal text
        String text_nR =  "\u001B[38;5;197m"; //NeonRed - For Errors or Warning
        String text_cR = "\u001B[0m"; //Color Reset

        System.out.println("Before we begin..");
        boolean initializationLoop = true;

        double capacity = -1;
        while(initializationLoop){
            System.out.println("\nTell me first the capacity of the Water Tank.");
            System.out.print("Capacity: ");
            String userInput = scanner.nextLine();

            try{
                capacity = Double.parseDouble(userInput);
            } catch (NumberFormatException e){
                System.out.println(text_nR + "Invalid Input!" + text_nO + " Please enter a " + text_nG + "valid" + text_nO + " value!" + text_cR);
                continue;
            }

            if(capacity <= 0){
                System.out.println(text_nR + "Invalid Input!" + text_nO + " Please enter a " + text_nG + "positive" + text_nO + " value!" + text_cR);
                continue;
            } else {
                initializationLoop = false;
            }
        }

        //Constructing a new Watertank Object
        WaterTank waterTank = new WaterTank(capacity);


        boolean systemLoop = true;

        while(systemLoop){
            System.out.println(text_nO + "\n  ------------- ");
            System.out.println(" |" + text_nC + "  WATERTANK" + text_nO + "  |");
            System.out.println("  ------------- ");

            System.out.println(text_nO + "\n1. " + text_nC + "Fill Water");
            System.out.println(text_nO + "2. " + text_nC + "Drain Water");
            System.out.println(text_nO + "3. " + text_nC + "Check Water Level");
            System.out.println(text_nO + "4. " + text_nC + "Check if Tank is" + text_nG + " Full");
            System.out.println(text_nO + "5. " + text_nC + "Check if Tank is" + text_nG + " Empty");
            System.out.println(text_nO + "6. " + text_nC + "Display Tank Visualization");
            System.out.println(text_nO + "7. " + text_nR + "Exit");

            System.out.print(text_nO + "\nChoice? [Ex. " + text_nG + "2" + text_nO + "]: ");
            String userChoice = scanner.nextLine();

            int choice = -1;
            try{
                choice = Integer.parseInt(userChoice);
            } catch (NumberFormatException e) {
                System.out.println(text_nR + "Invalid Input!" + text_nO +" Please enter [" + text_nG+"1" + text_nO + " - " + text_nG +"7" + text_nO + "] only!");
                continue;
            }

            switch (choice){
                case 1:{
                    System.out.println("\nCommand: " + text_nG +"Fill Water");
                    System.out.print(text_nO + "Liters to Add: ");
                    String input = scanner.nextLine();

                    double addedWater = -1;
                    try {
                        addedWater = Double.parseDouble(input);
                    } catch (NumberFormatException e){
                        System.out.println(text_nR + "\nError!" + text_nO + " Invalid input, " + text_nG + "Numbers" + text_nO + " only!");
                        break;
                    }

                    waterTank.fill(addedWater);
                    break;
                }
                case 2:{
                    System.out.println("\nCommand: " + text_nG +"Drain Water");
                    System.out.print(text_nO + "Liters to Drain: ");
                    String input = scanner.nextLine();

                    double drainWater = -1;
                    try {
                        drainWater = Double.parseDouble(input);
                    } catch (NumberFormatException e){
                        System.out.println(text_nR + "\nError!" + text_nO + " Invalid input, " + text_nG + "Numbers" + text_nO + " only!");
                        break;
                    }

                    waterTank.drain(drainWater);

                    break;
                }
                case 3:{
                    System.out.println("\nCommand: " + text_nG +"Check Water Level");

                    double waterLevel = waterTank.getCurrentLevel();
                    System.out.println(text_nO +"Current water level: " + text_nG + waterLevel + text_nO + " Ltr.");

                    break;
                }
                case 4:{
                    System.out.println("\nCommand: " + text_nG +"Check if Tank is Full");

                    boolean isFull = waterTank.isFull();
                    System.out.println(text_nO + "Is the water tank Full: " + text_nG + isFull);

                    break;
                }
                case 5:{
                    System.out.println("\nCommand: " + text_nG +"Check if Tank is Empty");

                    boolean isEmpty = waterTank.isEmpty();
                    System.out.println(text_nO + "Is the water tank Full: " + text_nG + isEmpty);
                    break;
                }
                case 6:{
                    System.out.println("\nCommand: " + text_nG +"Display Tank Visualization");
                    waterTank.prepareWaterLevel();
                    waterTank.printContainerAndWaterBlocks();
                    break;
                }
                case 7:{
                    System.out.println(text_nG + "Thank you" + text_nO +" for using the Program!");
                    systemLoop = false;
                    break;
                }
                default:{
                    System.out.println(text_nR +"Invalid Choice!" + text_nO + " Please enter between [" + text_nG+"1" + text_nO + " - " + text_nG +"7" + text_nO + "] only!");
                }
            }
        }
    }
}
