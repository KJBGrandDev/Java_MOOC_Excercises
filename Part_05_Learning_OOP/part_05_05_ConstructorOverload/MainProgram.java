package Part_05_Learning_OOP.part_05_05_ConstructorOverload;

public class MainProgram {
    public static void main(String[] args){
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster","home improvement section");
        Product tyre = new Product("Tyre",5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
