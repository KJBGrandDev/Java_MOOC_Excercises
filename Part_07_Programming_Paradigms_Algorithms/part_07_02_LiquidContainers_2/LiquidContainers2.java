package Part_07_Programming_Paradigms_Algorithms.part_07_02_LiquidContainers_2;

import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        UserInterface newUI = new UserInterface(scan,first,second);

        newUI.start();
    }
}
