package Part_06_Objects_And_Complex_Programs.part_06_12_JokeManager;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        manager.addJoke("Just joking 1");
        manager.addJoke("Just joking 2");
        manager.addJoke("Just joking 3");
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}
