package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_06_LimitedNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while(true){
            int input = Integer.parseInt(scanner.nextLine());
            if(input < 0){
                break;
            }

            numList.add(input);
        }

        numList.stream().filter(s -> s >= 1 && s <= 5).forEach(System.out::println);
    }
}