package Part_09_Advanced_OOP.Part_09_12_Animals;

public class Cat extends Animal implements NoiseCapable{

    public Cat(){
        super("Cat");
    }

    public Cat(String name){
        super(name);
    }

    public void purr(){
        System.out.printf("%s purrs\n", super.getName());
    }

    public void makeNoise(){
        this.purr();
    }
}
