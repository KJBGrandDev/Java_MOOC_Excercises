package Part_09_Advanced_OOP.Part_09_06_InterfaceInABox;

public class CD implements Packable{
    private String artistName;
    private String cdName;
    private int publicationYear;
    private double weight;

    public CD(String artistName, String cdName, int publicationYear){
        this.artistName = artistName;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    public double weight(){
        return this.weight;
    }

    public String toString(){
        return artistName + ": " + cdName + " (" + publicationYear + ")";
    }
}
