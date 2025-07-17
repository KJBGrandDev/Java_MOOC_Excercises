package Part_08_HashMaps_And_Objects.part_08_04_LiquidContainers2;

import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        Logic logic = new Logic(first,second);

        UserInterface newUI = new UserInterface(scan,logic);

        newUI.start();
    }
}