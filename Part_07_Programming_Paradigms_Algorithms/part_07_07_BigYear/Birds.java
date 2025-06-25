package Part_07_Programming_Paradigms_Algorithms.part_07_07_BigYear;

import java.util.HashMap;

public class Birds {
    private HashMap<String,String> bird;
    private HashMap<String,Integer> observation;

    public Birds(){
        this.bird = new HashMap<>();
        this.observation = new HashMap<>();
    }

    public void addBird(String englishName, String latinName){
        bird.put(englishName,latinName);
        observation.put(englishName,0);
    }

    public void addObservation(String animal){
        for(String i: bird.keySet()){
            if(i.contains(animal)){
                observation.put(i,observation.getOrDefault(i,0) + 1);
            }
        }
    }

    public HashMap<String,String> getBirds(){
        return bird;
    }

    public HashMap<String,Integer> getObservation(){
        return observation;
    }

}
