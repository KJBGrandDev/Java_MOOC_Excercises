package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_02_AverageOfSelectedNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop.");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }

            list.add(input);
        }
        double averageOfNegativeNumbers = list.stream().
                mapToInt(s -> Integer.parseInt(s)).
                filter(s -> s < 0).average().orElse(0.0);

        double averageOfPositiveNumbers = list.stream().
                mapToInt(s -> Integer.parseInt(s)).
                filter(s -> s > 0).average().orElse(0.0);
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String choice = scanner.nextLine().toLowerCase();
        switch(choice){
            case "n":{
                System.out.println("Average of the negative numbers: " + averageOfNegativeNumbers);
                break;
            }
            case "p":{
                System.out.println("Average of positive numbers: " + averageOfPositiveNumbers);
                break;
            }
            default:{
                System.out.println("Invalid choice!");
            }
        }
    }
}
