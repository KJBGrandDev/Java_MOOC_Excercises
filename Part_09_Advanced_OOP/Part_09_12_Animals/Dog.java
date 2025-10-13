package Part_09_Advanced_OOP.Part_09_12_Animals;

public class Dog extends Animal implements NoiseCapable {

    public Dog(){
        super("Dog");
    }

    public Dog(String name){
        super(name);
    }

    public void bark(){
        System.out.printf("%s barks\n",super.getName());
    }

    public void makeNoise(){
        this.bark();
    }
}
