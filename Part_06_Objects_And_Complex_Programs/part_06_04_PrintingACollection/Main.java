package Part_06_Objects_And_Complex_Programs.part_06_04_PrintingACollection;

public class Main {

    public static void main(String[] args) {

        // Try out your class here
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println(j);

        System.out.println();

        j.add("magneto");
        System.out.println(j);

        System.out.println();

        j.add("mystique");
        System.out.println(j);

        System.out.println();

        j.add("phoenix");
        System.out.println(j);


    }
}