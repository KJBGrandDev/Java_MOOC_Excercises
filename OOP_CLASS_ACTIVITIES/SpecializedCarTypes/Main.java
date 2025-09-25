package OOP_CLASS_ACTIVITIES.SpecializedCarTypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text_nG = "\u001B[38;5;46m"; // NeonGreen - For Highlighting
        String text_nO = "\u001B[38;5;214m"; // NeonOrange - For standard UI elements
        String text_nC = "\u001B[38;5;87m";  // NeonCyan - For normal text
        String text_nR = "\u001B[38;5;197m"; // NeonRed - For Errors or Warning
        String text_cR = "\u001B[0m";        // Color Reset

        System.out.println(text_nO + "╔══════════════════════════════════════╗");
        System.out.println("║" + text_nC + "       CAR MANAGEMENT SYSTEM          " + text_nO + "║");
        System.out.println("╚══════════════════════════════════════╝" + text_cR);

        // Car type selection
        System.out.println(text_nO + "\nSelect Car Type:");
        System.out.println(text_nO + "1. " + text_nC + "Regular Car (Gasoline)");
        System.out.println(text_nO + "2. " + text_nC + "Electric Car");
        System.out.println(text_nO + "3. " + text_nC + "Hybrid Car");
        System.out.print(text_nO + "\nChoice [1-3]: " + text_nG);
        int carType = getValidInt(scanner, 1, 3);
        System.out.print(text_cR);

        Car vehicle = null;
        HybridCar hybridVehicle = null;
        ElectricCar electricVehicle = null;

        // Initialize based on car type
        switch (carType) {
            case 1: // Regular Car
                System.out.println(text_nO + "\n--- Regular Car Setup ---");
                System.out.print("Enter car brand: " + text_nG);
                String brand = scanner.nextLine();
                System.out.print(text_nO + "Enter fuel capacity (L): " + text_nG);
                double fuelCapacity = getValidDouble(scanner);
                System.out.print(text_nO + "Enter fuel efficiency (km/L): " + text_nG);
                double fuelEfficiency = getValidDouble(scanner);
                vehicle = new Car(brand, fuelCapacity, fuelEfficiency);
                break;

            case 2: // Electric Car
                System.out.println(text_nO + "\n--- Electric Car Setup ---");
                System.out.print("Enter car brand: " + text_nG);
                String eBrand = scanner.nextLine();
                System.out.print(text_nO + "Enter battery capacity (kWh): " + text_nG);
                double batteryCapacity = getValidDouble(scanner);
                System.out.print(text_nO + "Enter energy consumption (km/kWh): " + text_nG);
                double efficiency = getValidDouble(scanner);
                electricVehicle = new ElectricCar(eBrand, batteryCapacity, efficiency);
                break;

            case 3: // Hybrid Car
                System.out.println(text_nO + "\n--- Hybrid Car Setup ---");
                System.out.print("Enter car brand: " + text_nG);
                String hBrand = scanner.nextLine();
                System.out.print(text_nO + "Enter fuel capacity (L): " + text_nG);
                double hFuelCapacity = getValidDouble(scanner);
                System.out.print(text_nO + "Enter fuel efficiency (km/L): " + text_nG);
                double hFuelEfficiency = getValidDouble(scanner);
                System.out.print(text_nO + "Enter battery capacity (kWh): " + text_nG);
                double hBatteryCapacity = getValidDouble(scanner);
                System.out.print(text_nO + "Enter energy consumption (km/kWh): " + text_nG);
                double hEfficiency = getValidDouble(scanner);
                hybridVehicle = new HybridCar(hBrand, hFuelCapacity, hFuelEfficiency, hBatteryCapacity, hEfficiency);
                break;
        }

        boolean systemLoop = true;

        while (systemLoop) {
            // Display status based on car type
            System.out.println(text_nO + "\n╔══════════════════════════════════════╗");
            System.out.println("║" + text_nC + "           VEHICLE STATUS             " + text_nO + "║");
            System.out.println("╠══════════════════════════════════════╣");

            if (carType == 1 && vehicle != null) {
                System.out.println(text_nO + "║ Type: " + text_nG + "Regular Car" + text_nO);
                System.out.println("║ Brand: " + text_nG + vehicle.getBrand() + text_nO);
                System.out.println("║ Fuel: " + text_nG + vehicle.getCurrentFuel() + "/" + vehicle.getFuelCapacity() + " L" + text_nO);
                System.out.println("║ Efficiency: " + text_nG + vehicle.getFuelEfficiency() + " km/L" + text_nO);
                System.out.println("║ Range: " + text_nG + vehicle.estimateRange() + " km" + text_nO);
            } else if (carType == 2 && electricVehicle != null) {
                System.out.println("║ Type: " + text_nG + "Electric Car" + text_nO);
                System.out.println("║ Brand: " + text_nG + electricVehicle.getBrand() + text_nO);
                System.out.println("║ Battery: " + text_nG + electricVehicle.getBatteryLevel() + "/" + electricVehicle.getBatteryCapacity() + " kWh" + text_nO);
                System.out.println("║ Efficiency: " + text_nG + electricVehicle.getEnergyConsumption() + " km/kWh" + text_nO);
                System.out.println("║ Range: " + text_nG + electricVehicle.estimateRange() + " km" + text_nO);
            } else if (carType == 3 && hybridVehicle != null) {
                System.out.println("║ Type: " + text_nG + "Hybrid Car" + text_nO);
                System.out.println("║ Brand: " + text_nG + hybridVehicle.getBrand() + text_nO);
                System.out.println("║ Fuel: " + text_nG + hybridVehicle.getCurrentFuel() + "/" + hybridVehicle.getFuelCapacity() + " L" + text_nO);
                System.out.println("║ Battery: " + text_nG + hybridVehicle.getBatteryLevel() + "/" + hybridVehicle.getBatteryCapacity() + " kWh" + text_nO);
                System.out.println("║ Range: " + text_nG + hybridVehicle.estimateRange() + " km" + text_nO);
            }

            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║" + text_nC + "           ACTIONS MENU               " + text_nO + "║");
            System.out.println("╠══════════════════════════════════════╣");

            // Display appropriate menu based on car type
            if (carType == 1) {
                System.out.println("║ " + text_nO + "1. " + text_nC + "Refuel                            " + text_nO + "║");
                System.out.println("║ " + text_nO + "2. " + text_nC + "Drive                             " + text_nO + "║");
            } else if (carType == 2) {
                System.out.println("║ " + text_nO + "1. " + text_nC + "Recharge                          " + text_nO + "║");
                System.out.println("║ " + text_nO + "2. " + text_nC + "Drive                             " + text_nO + "║");
            } else if (carType == 3) {
                System.out.println("║ " + text_nO + "1. " + text_nC + "Refuel                            " + text_nO + "║");
                System.out.println("║ " + text_nO + "2. " + text_nC + "Recharge                          " + text_nO + "║");
                System.out.println("║ " + text_nO + "3. " + text_nC + "Drive                             " + text_nO + "║");
            }
            System.out.println("║ " + text_nO + "0. " + text_nR + "Exit                              " + text_nO + "║");
            System.out.println("╚══════════════════════════════════════╝");

            System.out.print(text_nO + "\nChoice: " + text_nG);
            int choice;
            if (carType == 3) {
                choice = getValidInt(scanner, 0, 3);
            } else {
                choice = getValidInt(scanner, 0, 2);
            }
            System.out.print(text_cR);

            switch (choice) {
                case 0:
                    System.out.println(text_nG + "\nThank you for using the Car Management System!" + text_cR);
                    systemLoop = false;
                    break;

                case 1:
                    if (carType == 1) {
                        System.out.print(text_nO + "\nRefuel amount (L): " + text_nG);
                        double fuelAmount = getValidDouble(scanner);
                        vehicle.refuel(fuelAmount);
                    } else if (carType == 2) {
                        System.out.print(text_nO + "\nRecharge amount (kWh): " + text_nG);
                        double chargeAmount = getValidDouble(scanner);
                        electricVehicle.recharge(chargeAmount);
                    } else if (carType == 3) {
                        System.out.print(text_nO + "\nRefuel amount (L): " + text_nG);
                        double fuelAmount = getValidDouble(scanner);
                        hybridVehicle.refuel(fuelAmount);
                    }
                    break;

                case 2:
                    if (carType == 3) {
                        System.out.print(text_nO + "\nRecharge amount (kWh): " + text_nG);
                        double chargeAmount = getValidDouble(scanner);
                        hybridVehicle.recharge(chargeAmount);
                    } else {
                        System.out.print(text_nO + "\nDrive distance (km): " + text_nG);
                        double distance = getValidDouble(scanner);
                        if (carType == 1) {
                            vehicle.drive(distance);
                        } else {
                            electricVehicle.drive(distance);
                        }
                    }
                    break;

                case 3:
                    if (carType == 3) {
                        System.out.print(text_nO + "\nDrive distance (km): " + text_nG);
                        double distance = getValidDouble(scanner);
                        hybridVehicle.drive(distance);
                    }
                    break;
            }

            // Pause before continuing
            System.out.print(text_nO + "\nPress Enter to continue..." + text_cR);
            scanner.nextLine();
        }

        scanner.close();
    }

    private static int getValidInt(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.print("\u001B[38;5;197mInvalid choice! Enter " + min + "-" + max + ": \u001B[38;5;46m");
            } catch (NumberFormatException e) {
                System.out.print("\u001B[38;5;197mInvalid input! Enter a number: \u001B[38;5;46m");
            }
        }
    }

    private static double getValidDouble(Scanner scanner) {
        while (true) {
            try {
                double value = Double.parseDouble(scanner.nextLine());
                if (value > 0) {
                    return value;
                }
                System.out.print("\u001B[38;5;197mMust be positive! Enter again: \u001B[38;5;46m");
            } catch (NumberFormatException e) {
                System.out.print("\u001B[38;5;197mInvalid input! Enter a number: \u001B[38;5;46m");
            }
        }
    }
}