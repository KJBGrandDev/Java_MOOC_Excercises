package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.UI;

import Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.Domain.Airplane;
import Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.Logic.FlightControl;

import java.util.Scanner;

public class TextInterface {
    private Scanner scanner;
    private FlightControl flightControl;

    public TextInterface(Scanner scanner, FlightControl flightControl){
        this.scanner = scanner;
        this.flightControl = flightControl;
    }

    public void start(){
        this.startAssetControlSystem();
        this.startFlightControlSystem();
    }

    public void startAssetControlSystem(){
        System.out.println("Airport Asset Control");

        boolean assetControlSystem = true;

        while(assetControlSystem){
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            String input = scanner.nextLine();

            switch(input){
                case "1":{
                    System.out.print("Give the airplane id: ");
                    String id = scanner.nextLine();
                    System.out.print("Give the airplane capacity: ");
                    int capacity = Integer.parseInt(scanner.nextLine());
                    flightControl.addAirplanes(id,capacity);
                    break;
                }
                case "2":{
                    System.out.print("Give the airplane id: ");
                    Airplane airplane = findAirplane(scanner.nextLine());
                    System.out.print("Give the departure airport id: ");
                    String departureAirport = scanner.nextLine();
                    System.out.print("Give the target airport id: ");
                    String targetAirport =scanner.nextLine();

                    flightControl.addFlight(airplane,departureAirport,targetAirport);
                    break;
                }
                case "x":{
                    assetControlSystem = false;
                    break;
                }
            }
        }
    }

    public void startFlightControlSystem(){
        System.out.println("Flight Control System\n");

        boolean flightControlSystem = true;

        while(flightControlSystem){
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String input = scanner.nextLine();

            switch (input){
                case "1":{
                    flightControl.printAirplanes();
                    break;
                }
                case "2":{
                    flightControl.printFlights();
                    break;
                }
                case "3":{
                    System.out.print("Give the airplane id: ");
                    String givenAirPlaneId = scanner.nextLine();
                    for(String i: this.flightControl.getAirplaneList().keySet()){
                        if(i.matches(givenAirPlaneId)){
                            System.out.println(this.flightControl.getAirplaneList().get(i));
                        }
                    }
                    break;
                }
                case "x":{
                    flightControlSystem = false;
                    break;
                }
            }
        }
    }

    public Airplane findAirplane(String string){
        Airplane airplane = null;
        for(String i: flightControl.getAirplaneList().keySet()){
            if(i.equals(string)){
                airplane = flightControl.getAirplaneList().get(i);
            }
        }
        return airplane;
    }
}
