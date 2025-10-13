package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_03_PositiveNumbers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> newList = new ArrayList<>();

        System.out.println("Input a stream of numbers, type 'end' to end");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            int inputToInt = Integer.parseInt(input);
            newList.add(inputToInt);
        }
        System.out.println("Positive numbers: " + positive(newList));
    }

    public static List<Integer> positive(List<Integer> list){
        List<Integer> positiveNumbers = list.stream().mapToInt(Integer::valueOf).filter(s -> s > 0).boxed().collect(Collectors.toCollection(ArrayList::new));

        return positiveNumbers;
    }
}
