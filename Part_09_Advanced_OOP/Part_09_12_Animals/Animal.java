package Part_09_Advanced_OOP.Part_09_12_Animals;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    };
    public void eat(){
        System.out.printf("%s eats\n", this.name);
    }

    public void sleep(){
        System.out.printf("%s sleeps\n", this.name);
    }

    public String getName(){
        return this.name;
    }
}
