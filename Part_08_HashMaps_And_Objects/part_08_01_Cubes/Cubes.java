package Part_08_HashMaps_And_Objects.part_08_01_Cubes;

import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();

            if(input.equals("end")){
                break;
            }

            int num = Integer.parseInt(input);
            int cube = num * num * num;
            System.out.println(cube);
        }
    }
}
