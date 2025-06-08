package Part_05_Learning_OOP.part_05_09_BiggestPetShop;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);

        System.out.println(leo);
    }
}
