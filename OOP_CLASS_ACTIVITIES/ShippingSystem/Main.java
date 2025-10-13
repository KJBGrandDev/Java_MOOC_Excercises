package OOP_CLASS_ACTIVITIES.ShippingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ErrorChecker errorChecker = new ErrorChecker();

        boolean menu = true;
        while(menu){
            System.out.println("Choose the type of Shipment:");
            System.out.println("1. Standard Shipment");
            System.out.println("2. Express Shipment");
            System.out.println("3. International Shipment");
            System.out.println("4. Exit");
            System.out.print("Choice [ex. '2']: ");

            String menuInput = scanner.nextLine();
            int menuChoice = 0;
            try{
                menuChoice = Integer.parseInt(menuInput);
            } catch (NumberFormatException e){
                System.out.println("Invalid Input! Please enter a valid value!");
                continue;
            }

            switch(menuChoice){
                case 1:{
                    System.out.println("\nStandard Shipment!\n");
                    ShipmentInput input = standardInput();
                    System.out.println("Insurance Fee: ");
                    double insuranceFee = errorChecker.errorDouble(scanner);

                    StandardShipment newStandardShipment = new StandardShipment(input.getTrackingNumber(), input.getSender(), input.getReceiver(), input.getWeight(), input.getBaseRate(), input.getDistanceKm(), insuranceFee);

                    if(input.isDelivered()){
                        newStandardShipment.markDelivered();
                    }

                    System.out.println("\nConfirmed Details!\n");
                    System.out.println(newStandardShipment.getDetails());
                    break;
                }
                case 2:{
                    System.out.println("\nExpress Shipment!\n");
                    ShipmentInput input = standardInput();
                    System.out.println("Priority Level [Normal / High / Rush]:");
                    String priorityLevel = scanner.nextLine();

                    ExpressShipment newExpressShipment = new ExpressShipment(input.getTrackingNumber(), input.getSender(), input.getReceiver(), input.getWeight(), input.getBaseRate(), input.getDistanceKm(), priorityLevel);

                    if(input.isDelivered()){
                        newExpressShipment.markDelivered();
                    }

                    System.out.println("\nConfirmed Details!\n");
                    System.out.println(newExpressShipment.getDetails() + "\nEstimated Delivery Time: " + newExpressShipment.getEstimatedDeliveryDays() + " days" + "\nIs it High priority: " + newExpressShipment.isHighPriority() + "\n");
                    break;
                }
                case 3:{
                    System.out.println("\nInternational Shipment!\n");
                    ShipmentInput input = standardInput();
                    System.out.println("Customs Fee:");
                    double customsFee = errorChecker.errorDouble(scanner);
                    System.out.println("Destination Country:");
                    String destinationCountry = scanner.nextLine();

                    InternationalShipment newInternationalShipment = new InternationalShipment(input.getTrackingNumber(), input.getSender(), input.getReceiver(), input.getWeight(), input.getBaseRate(), input.getDistanceKm(), customsFee, destinationCountry);

                    if(input.isDelivered()){
                        newInternationalShipment.markDelivered();
                    }

                    System.out.println("\nConfirmed Details!\n");
                    System.out.println(newInternationalShipment.getDetails() + "\nEstimated Delivery Time: " + newInternationalShipment.getEstimatedDeliveryDays() + " days" + "\nCustoms Fee: $ " + newInternationalShipment.getCustomsFee() + "\nDestination Country: " + newInternationalShipment.getDestinationCountry() + "\nRequires Customs Declaration: " + newInternationalShipment.requiresCustomsDeclaration() + "\n");
                    break;
                }
                case 4:{
                    System.out.println("Thank you for using this program!");
                    menu = false;
                    break;
                }
                default:{
                    System.out.println("Invalid Input! Please choose between [1-4] only!");
                }
            }
        }
    }

    public static ShipmentInput standardInput(){
        Scanner scanner = new Scanner(System.in);
        ErrorChecker errorChecker = new ErrorChecker();

        System.out.println("Tracking Number: ");
        String trackingNumber = scanner.nextLine();
        System.out.println("Sender: ");
        String sender = scanner.nextLine();
        System.out.println("Receiver: ");
        String receiver = scanner.nextLine();
        System.out.println("Carriage weight: ");
        double carriageWeight = errorChecker.errorDouble(scanner);
        System.out.println("Base Rate: ");
        double baseRate = errorChecker.errorDouble(scanner);
        System.out.println("Distance in Kilometer: ");
        double distanceKm = errorChecker.errorDouble(scanner);
        System.out.println("Is it already delivered? [True / False]");
        boolean delivered = errorChecker.errorBoolean(scanner);

        return new ShipmentInput(trackingNumber, sender, receiver, carriageWeight, baseRate, distanceKm, delivered);
    }


}