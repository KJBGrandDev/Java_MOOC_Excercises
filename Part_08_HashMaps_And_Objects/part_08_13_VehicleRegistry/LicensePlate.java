package Part_08_HashMaps_And_Objects.part_08_13_VehicleRegistry;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object comparedPlate){
        if(this == comparedPlate){
            return true;
        }

        if(!(comparedPlate instanceof LicensePlate)){
            return false;
        }

        LicensePlate newPlate = (LicensePlate) comparedPlate;

        if((newPlate.country.equals(this.country)) && (newPlate.liNumber.equals(this.liNumber))){
            return true;
        }

        return false;
    }

    public int hashCode(){
        if(this.country == null){
            return this.liNumber.hashCode();
        }
        return this.country.hashCode() + this.liNumber.hashCode();
    }
}