package Part_04_Introduction_To_OOP.part_04_11_Film;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test your Film class here

         Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

         Scanner reader = new Scanner(System.in);

         System.out.println("How old are you");
         int age = Integer.valueOf(reader.nextLine());

         System.out.println();
         if (age >= chipmunks.ageRating()) {
             System.out.println("You may watch the film " + chipmunks.name());
         } else {
             System.out.println("You may not watch the film " + chipmunks.name());
         }
         String firstName = "Aliyah";
         String lastName = "Piel";
        System.out.println(firstName + lastName);
    }
}
