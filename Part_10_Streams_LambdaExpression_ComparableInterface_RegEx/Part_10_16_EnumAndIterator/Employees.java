package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_16_EnumAndIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> personList;

    public Employees(){
        this.personList = new ArrayList<>();
    }

    public void add(Person person){
        personList.add(person);
    }

    public void add(List<Person> peopleToAdd){
        personList.addAll(peopleToAdd);
    }

    public void print(){
        Iterator<Person> iterator = personList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void print(Education education){
        Iterator<Person> iterator = personList.iterator();

        while(iterator.hasNext()){
            Person i = iterator.next();
            if(i.getEducation().equals(education)){
                System.out.println(i);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = personList.iterator();

        while (iterator.hasNext()){
            Person i = iterator.next();
            if(i.getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
