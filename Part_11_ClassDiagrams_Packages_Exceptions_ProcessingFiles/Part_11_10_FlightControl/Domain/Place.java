package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.Domain;

public class Place {
    private String place;

    public Place(String place){
        this.place = place;
    }

    public String getPlace(){
        return this.place;
    }

    public String toString(){
        return String.format("%s",this.place);
    }
}
