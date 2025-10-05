package Part_09_Advanced_OOP.Part_09_02_PersonAndSubclasses;

class Person {
    protected String name;
    protected String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return this.name + "\n  " + this.address;
    }
}
