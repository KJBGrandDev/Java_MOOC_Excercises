import java.util.Scanner;

public class part_03_30_Age_Of_The_Oldest{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        
        while(true){
            String stringInput = scanner.nextLine();
            if(stringInput.equals("")){
                System.out.println("Age of the Oldest: " + oldestAge);
                break;
            }

            String[] stringArray = stringInput.split(",");
            int age = Integer.valueOf(stringArray[1]);
            
            if(age > oldestAge){
                oldestAge = age;
            }
        }
        
    }
}