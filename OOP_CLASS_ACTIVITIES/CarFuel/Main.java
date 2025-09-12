package OOP_CLASS_ACTIVITIES.CarFuel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String text_nG = "\u001B[38;5;46m"; //NeonGreen - For Highlighting
        String text_nO = "\u001B[38;5;214m"; //NeonOrange - For standard UI elements
        String text_nC = "\u001B[38;5;87m"; //NeonCyan - For normal text
        String text_nR =  "\u001B[38;5;197m"; //NeonRed - For Errors or Warning
        String text_cR = "\u001B[0m"; //Color Reset

        boolean initialization = true;

        System.out.println("Initializing Car Capacity!");

        double tankCapacity = -1;
        double fuelEfficiency = -1;

        while(initialization){
            System.out.print("\nGive me the fuel tank capacity: ");
            String rawTankCapacity = scanner.nextLine();

            try{
                tankCapacity = Double.parseDouble(rawTankCapacity);
            } catch (NumberFormatException e){
                System.out.println(text_nR +"Invalid input!" + text_nO + "Please give a" + text_nG + " valid" + text_nO + " value!");
                continue;
            }
            if(tankCapacity <= 0){
                System.out.println(text_nR + "Invalid input!" + text_nO + " Please give a" + text_nG + " positive" + text_nO + " value!");
                continue;
            }

            System.out.print("Give me the car engine efficiency [km/L]: ");
            String rawFuelEfficiency = scanner.nextLine();

            try{
                fuelEfficiency = Double.parseDouble(rawFuelEfficiency);
            } catch (NumberFormatException e){
                System.out.println(text_nR +"Invalid input!" + text_nO + "Please give a" + text_nG + " valid" + text_nO + " value!");
                continue;
            }
            if(fuelEfficiency <= 0){
                System.out.println(text_nR + "Invalid input!" + text_nO + " Please give a" + text_nG + " positive" + text_nO + " value!");
                continue;
            }
            initialization = false;
        }

        CarFuel newCarFuel = new CarFuel(tankCapacity,fuelEfficiency);

        boolean systemLoop = true;

        while (systemLoop){
            System.out.println(text_nO + "\n  -------------- ");
            System.out.println(" |" + text_nC + "  CAR SYSTEM" + text_nO + "  |");
            System.out.println("  -------------- ");
            System.out.println(text_nO + "\nFuel Capacity: " + text_nG + newCarFuel.getFuelCapacity() + " L");
            System.out.println(text_nO + "Engine Efficiency: " + text_nG + newCarFuel.getFuelEfficiency() + " km/L");
            System.out.println(text_nO + "Current Fuel: " + text_nG + newCarFuel.getCurrentFuel() + " L");
            System.out.println(text_nO + "You can drive " + text_nG + newCarFuel.estimateRange() + text_nO + " km with this much fuel.");

            System.out.println(text_nO + "\nWhat would you like to do?");
            System.out.println(text_nO + "1. " + text_nC + "Refuel");
            System.out.println(text_nO + "2. " + text_nC + "Drive");
            System.out.println(text_nO + "3. " + text_nR + "Exit");
            System.out.print(text_nO + "\nChoice [ex. " + text_nG + "2" + text_nO + "]: ");
            String rawChoice = scanner.nextLine();

            int choice = -1;
            try{
                choice = Integer.parseInt(rawChoice);
            } catch (NumberFormatException e) {
                System.out.println(text_nR + "Invalid Choice!" + text_nO + " Please choose a value between [" + text_nG + "1-3" + text_nO + "] only!");
                continue;
            }

            switch (choice){
                case 1:{
                    System.out.println("\nCommand: " + text_nG + "Refuel");
                    System.out.print(text_nO + "Amount of fuel: ");
                    String rawRefuel = scanner.nextLine();

                    double refuel = -1;
                    try{
                        refuel = Integer.parseInt(rawRefuel);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Input! Please give a valid value!");
                    }

                    newCarFuel.refuel(refuel);
                    break;
                }
                case 2:{
                    System.out.println("\nCommand: " + text_nG + "Drive");
                    System.out.print(text_nO + "Input Distance: ");
                    String rawDistance = scanner.nextLine();

                    double distance = -1;
                    try{
                        distance = Integer.parseInt(rawDistance);
                    } catch (NumberFormatException e) {
                        System.out.println(text_nR + "Invalid Input!" + text_nO + " Please give a " + text_nG + "valid" + text_nO + " value!");
                    }

                    newCarFuel.drive(distance);
                    break;
                }
                case 3:{
                    System.out.println(text_nG + "Thank you" + text_nO + " for using this program!");
                    systemLoop = false;
                    break;
                }
                default:{
                    System.out.println(text_nR + "Invalid Choice!" + text_nO + " Please choose a value between [" + text_nG + "1-3" + text_nO + "] only!");
                }
            }
        }
    }
}
