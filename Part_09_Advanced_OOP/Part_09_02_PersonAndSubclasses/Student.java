package Part_09_Advanced_OOP.Part_09_02_PersonAndSubclasses;

class Student extends Person{
    protected int credits;

    public Student(String name, String address){
        super(name,address);
        this.credits = 0;
    }

    public void study(){
        this.credits += 1;
    }

    public String credits(){
        return "Study credits " + this.credits;
    }

    public String toString(){
        return super.toString() + "\n   " + this.credits();
    }
}
