package Part_04_Introduction_To_OOP.part_04_21_NumberOfStrings;

import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}