package Part_05_Learning_OOP.part_05_07_HealthStation;

public class HealthStation {
    private int weighings;
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighings += 1;
        return person.getWeight();
    }

    public void feed(Person person){
        int i = person.getWeight();
        i++;
        person.setWeight(i);
    }

    public int weighings(){
        return this.weighings;
    }
}
