package Part_06_Objects_And_Complex_Programs.part_06_06_LongestInCollection;

public class Main {

    public static void main(String[] args) {


        // Try out your class here
        SimpleCollection c = new SimpleCollection("characters");
        System.out.println("Pisin: " + c.longest());

        c.add("magneto");
        c.add("mystique");
        c.add("phoenix");

        System.out.println("Longest: " + c.longest());


    }
}
