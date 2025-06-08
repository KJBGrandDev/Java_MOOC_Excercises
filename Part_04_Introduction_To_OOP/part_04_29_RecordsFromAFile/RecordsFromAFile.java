package Part_04_Introduction_To_OOP.part_04_29_RecordsFromAFile;

import java.nio.file.Paths;
import java.util.Scanner;
public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get("Part_04_Introduction_To_OOP/part_04_29_RecordsFromAFile/" + fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] split = line.split(",");

                String name = split[0];
                int age = Integer.parseInt(split[1]);

                if (age > 1 || age == 0) {
                    System.out.println(name + ", age: " + age + " years");
                } else if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
