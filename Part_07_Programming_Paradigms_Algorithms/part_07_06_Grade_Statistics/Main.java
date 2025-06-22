package Part_07_Programming_Paradigms_Algorithms.part_07_06_Grade_Statistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points();

        UserInterface newUI = new UserInterface(scanner,points);

        newUI.start();
    }
}
