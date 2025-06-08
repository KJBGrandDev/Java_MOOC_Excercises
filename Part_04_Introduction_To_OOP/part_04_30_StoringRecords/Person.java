package Part_04_Introduction_To_OOP.part_04_30_StoringRecords;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return this.name + ", age: " + this.age;
    }
}
