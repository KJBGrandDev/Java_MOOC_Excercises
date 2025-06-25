package Part_07_Programming_Paradigms_Algorithms.part_07_07_BigYear;

import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Birds bird = new Birds();

        UserInterface newUI = new UserInterface(scan,bird);

        newUI.start();
    }
}
