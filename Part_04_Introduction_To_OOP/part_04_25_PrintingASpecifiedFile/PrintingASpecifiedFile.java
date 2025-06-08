package Part_04_Introduction_To_OOP.part_04_25_PrintingASpecifiedFile;

import java.nio.file.Paths;
import java.util.Scanner;
public class PrintingASpecifiedFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try(Scanner firstScanner = new Scanner(Paths.get("Part_04_Introduction_To_OOP/part_04_25_PrintingASpecifiedFile/" + input))){
            while(firstScanner.hasNextLine()){
                String row = firstScanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
