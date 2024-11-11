import java.util.Scanner;

public class part_03_32_personalDetails{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int currentLongestNameSize = 0;

        int numberOfInputs = 0;
        double averageYear = 0;

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] inputArray = input.split(",");
            String name = inputArray[0];
            int nameSize = inputArray[0].length();
            int birthYear = Integer.valueOf(inputArray[1]);

            if(nameSize > currentLongestNameSize){
                currentLongestNameSize = nameSize;
                longestName = name;
            }

            averageYear += birthYear;
            numberOfInputs++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * (averageYear / numberOfInputs)));
    }
}