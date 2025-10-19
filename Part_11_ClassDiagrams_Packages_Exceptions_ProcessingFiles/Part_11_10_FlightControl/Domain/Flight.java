package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.Domain;

public class Flight {
    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;

    public Flight(Airplane airplane, Place departureAirport, Place targetAirport){
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }

    public Airplane getAirplane(){
        return this.airplane;
    }

    public Place getDepartureAirport(){
        return this.departureAirport;
    }

    public Place getTargetAirport(){
        return this.targetAirport;
    }

    public String toString(){
        return String.format("%s (%d capacity) (%s-%s)",
                this.airplane.getId(),
                this.airplane.getCapacity(),
                this.departureAirport.getPlace(),
                this.targetAirport.getPlace()
        );
    }
}
