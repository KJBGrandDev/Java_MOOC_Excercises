package Part_06_Objects_And_Complex_Programs.part_06_01_Menu;

public class Main {
    public static void main(String[] args) {
        Menu exactum = new Menu();

        exactum.addMeal("Tofu ratatouille");
        exactum.addMeal("Chili coconut chicken");
        exactum.addMeal("Chili coconut chicken");
        exactum.addMeal("Meatballs with mustard sauce");

        exactum.printMeals();
        exactum.clearMenu();
        System.out.println();
        exactum.addMeal("Tomato and mozarella salad");
        exactum.printMeals();
    }
}
