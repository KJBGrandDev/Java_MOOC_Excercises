package Part_04_Introduction_To_OOP.part_04_19_TelevisionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Name: ");
            String nameInput = scanner.nextLine();

            if(nameInput.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            int ageInput = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(nameInput, ageInput));
        }

        System.out.println("Program's maximum duration? ");
        int durationInput = Integer.parseInt(scanner.nextLine());

        for(TelevisionProgram program: programs){
            if(program.getDuration() <= durationInput){
                System.out.println(program);
            }
        }
    }
}