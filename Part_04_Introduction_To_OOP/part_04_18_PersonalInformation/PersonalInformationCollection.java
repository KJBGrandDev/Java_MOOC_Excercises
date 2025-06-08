package Part_04_Introduction_To_OOP.part_04_18_PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("First name: ");
            String firstName = scanner.nextLine();

            if(firstName.isEmpty()){
                break;
            }

            System.out.println("Last name: ");
            String lastName = scanner.nextLine();

            System.out.println("Identification Number: ");
            String identificationNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }

        for(PersonalInformation output: infoCollection){
            System.out.println(output.getFirstName() + " " + output.getLastName());
        }
        String test = "paragraph";
        int instance = test.indexOf('p');
        System.out.println("Result: " + instance);
        int lastInstance = test.lastIndexOf('p');
        System.out.println("Result: " + lastInstance);

        int num = 10;
        if(num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
