package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.Domain;

public class Airplane {
    private String id;
    private int capacity;

    public Airplane(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }

    public String getId(){
        return this.id;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String toString(){
        return String.format("%s (%d capacity)",this.id,this.capacity);
    }
}
