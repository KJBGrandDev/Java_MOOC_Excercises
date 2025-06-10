package Part_06_Objects_And_Complex_Programs.part_06_07_HeightOrder;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personList;

    public Room(){
        this.personList = new ArrayList<>();
    }

    public void add(Person person){
        personList.add(person);
    }

    public boolean isEmpty(){
        if(personList.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return personList;
    }

    public Person shortest(){
        Person shortest = personList.get(0);

        for(Person person: personList){
            if(shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take(){
        Person shortest = shortest();
        personList.remove(shortest);
        return shortest;
    }
}
