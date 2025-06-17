package Part_06_Objects_And_Complex_Programs.part_06_10_ToDoList;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            TodoList list = new TodoList();
            UserInterface ui = new UserInterface(list,scanner);

            ui.start();
        }
}
