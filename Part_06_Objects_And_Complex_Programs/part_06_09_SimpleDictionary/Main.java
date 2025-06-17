package Part_06_Objects_And_Complex_Programs.part_06_09_SimpleDictionary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scanner,dictionary);
        textUI.start();
    }
}
