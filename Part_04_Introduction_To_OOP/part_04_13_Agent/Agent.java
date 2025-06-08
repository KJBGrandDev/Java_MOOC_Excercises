package Part_04_Introduction_To_OOP.part_04_13_Agent;

public class Agent {

    private String firstName;
    private String lastName;

    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }

    public String toString(){
        return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }
}
