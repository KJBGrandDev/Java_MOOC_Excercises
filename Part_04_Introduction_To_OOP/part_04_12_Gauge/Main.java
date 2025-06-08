package Part_04_Introduction_To_OOP.part_04_12_Gauge;

public class Main {

    public static void main(String[] args) {
        // Test your Gauge class here

         Gauge g = new Gauge();

         while(!g.full()) {
             System.out.println("Not full! Value: " + g.value());
             g.increase();
         }

         System.out.println("Full! Value: " + g.value());
         g.decrease();
         System.out.println("Not full! Value: " + g.value());
    }
}
