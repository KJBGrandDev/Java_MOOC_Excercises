package Part_04_Introduction_To_OOP.part_04_28_NumbersFromAFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();

        System.out.println("Lower Bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());

        System.out.println("Upper Bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        int numberCount = 0;

        try(Scanner fileScanner = new Scanner(Paths.get("Part_04_Introduction_To_OOP/part_04_28_NumbersFromAFile/" + file))){
            while(fileScanner.hasNextInt()){
                int input = fileScanner.nextInt();

                if(input >= lowerBound && input <= upperBound){
                    numberCount++;
                }
            }
            System.out.println("Numbers: " + numberCount);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
