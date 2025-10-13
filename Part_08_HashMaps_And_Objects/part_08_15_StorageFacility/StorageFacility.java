package Part_08_HashMaps_And_Objects.part_08_15_StorageFacility;

import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> newStorage;

    public StorageFacility(){
        this.newStorage = new HashMap<>();
    }

    public void add(String unit, String item){
        if(!newStorage.containsKey(unit)){
            newStorage.put(unit, new ArrayList<>());
            ArrayList<String> list = newStorage.get(unit);
            list.add(item);
        } else {
            ArrayList<String> list = newStorage.get(unit);
            list.add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit){
        if(newStorage.containsKey(storageUnit)){
            return newStorage.get(storageUnit);
        }
        newStorage.put(storageUnit, new ArrayList<>());
        return newStorage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> list = newStorage.get(storageUnit);
        list.remove(item);
        if (newStorage.get(storageUnit).isEmpty()) {
            newStorage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> unit = new ArrayList<String>();
        for(String i: newStorage.keySet()){
            if(!newStorage.get(i).isEmpty()){
                unit.add(i);
            }
        }
        return unit;
    }
}
