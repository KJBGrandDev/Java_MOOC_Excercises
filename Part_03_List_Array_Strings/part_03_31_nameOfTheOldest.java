import java.util.Scanner;

public class part_03_31_nameOfTheOldest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String oldestPersonName = "";
        int oldestAge = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                System.out.println("Name of the oldest: " + oldestPersonName);
                break;
            }

            String[] stringArray = input.split(",");
            String name = stringArray[0];
            int age = Integer.valueOf(stringArray[1]);

            if(age > oldestAge){
                oldestAge = age;
                oldestPersonName = name;
            }
        }
    }   
}
