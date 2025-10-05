package Part_09_Advanced_OOP.Part_09_02_PersonAndSubclasses;

public class Teacher extends Person{
    protected int salary;

    public Teacher(String name, String address, int salary){
        super(name,address);
        this.salary = salary;
    }

    public String salary(){
        return "salary " + this.salary + " euro/month";
    }

    public String toString(){
        return super.toString() + "\n   " + this.salary();
    }
}
