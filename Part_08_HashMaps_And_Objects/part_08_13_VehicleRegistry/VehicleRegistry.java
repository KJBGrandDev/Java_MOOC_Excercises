package Part_08_HashMaps_And_Objects.part_08_13_VehicleRegistry;

import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> newRegistration;

    public VehicleRegistry(){
        this.newRegistration = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(!newRegistration.containsKey(licensePlate)){
            newRegistration.put(licensePlate,owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        return newRegistration.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate){
        if(!newRegistration.containsKey(licensePlate)){
            return false;
        } else {
            newRegistration.remove(licensePlate);
            return true;
        }
    }

    public void printLicensePlates(){
        for(LicensePlate i: newRegistration.keySet()){
            System.out.println(i);
        }
    }

    public void printOwners(){
        for(String i: new HashSet<>(newRegistration.values())){
            System.out.println(i);
        }
    }
}
