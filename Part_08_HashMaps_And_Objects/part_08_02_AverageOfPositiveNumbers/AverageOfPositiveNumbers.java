package Part_08_HashMaps_And_Objects.part_08_02_AverageOfPositiveNumbers;

import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNum = 0;
        int counter = 0;

        while(true){
            int input = Integer.parseInt(scanner.nextLine());

            if(input > 0){
                totalNum += input;
                counter++;
            }

            if(input == 0){
                break;
            }
        }

        if(totalNum == 0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) totalNum/counter;
            System.out.println(average);
        }
    }
}