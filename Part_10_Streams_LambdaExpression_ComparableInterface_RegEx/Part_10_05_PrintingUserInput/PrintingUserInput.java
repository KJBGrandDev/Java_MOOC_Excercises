package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_05_PrintingUserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newList = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }

            newList.add(input);
        }

        String filtered = newList.stream().reduce("",(previousString,word) -> previousString + word + "\n");
        System.out.println(filtered);
    }
}
