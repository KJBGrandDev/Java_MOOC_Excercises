package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_01_AverageOfNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {
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

        double average =
                list.stream().
                        mapToInt(s -> Integer.parseInt(s)).
                        average().
                        getAsDouble();
        System.out.printf("average of numbers: %.2f",average);
    }
}
