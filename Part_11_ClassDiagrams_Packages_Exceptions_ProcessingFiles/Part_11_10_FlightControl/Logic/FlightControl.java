package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.Logic;

import Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.Domain.Airplane;
import Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.Domain.Flight;
import Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.Domain.Place;

import java.util.HashMap;

public class FlightControl {
    private HashMap<String,Airplane> airplaneList;
    private HashMap<String, Place> placeList;
    private HashMap<String,Flight> flightList;

    public FlightControl(){
        this.airplaneList = new HashMap<>();
        this.placeList = new HashMap<>();
        this.flightList = new HashMap<>();
    }

    public void addAirplanes(String id,int capacity){
        if(!this.airplaneList.containsKey(id)){
            this.airplaneList.put(id,new Airplane(id, capacity));
        }
    }
    public void printAirplanes(){
        for(Airplane i: this.airplaneList.values()){
            System.out.println(i);
        }
    }

    public void addFlight(Airplane airplane, String departureAirport, String targetAirport){
        this.placeList.putIfAbsent(departureAirport, new Place(departureAirport));
        this.placeList.putIfAbsent(targetAirport, new Place(targetAirport));

        Flight newFlight = new Flight(airplane,this.placeList.get(departureAirport),this.placeList.get(targetAirport));
        this.flightList.put(newFlight.toString(), newFlight);
    }

    public void printFlights(){
        for(Flight i: this.flightList.values()){
            System.out.println(i);
        }
    }

    public HashMap<String,Airplane> getAirplaneList(){
        return this.airplaneList;
    }
}
