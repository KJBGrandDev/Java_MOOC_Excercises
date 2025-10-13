package Part_09_Advanced_OOP.Part_09_12_Animals;

public class Main {
    public static void main(String[] args){
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }
}
