package Part_07_Programming_Paradigms_Algorithms.part_07_06_RecipeSearch;

import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface newUI = new UserInterface(scanner);

        newUI.start();
    }

}