package Part_07_Programming_Paradigms_Algorithms.part_07_07_BigYear;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Birds birds;

    public UserInterface(Scanner scanner, Birds birds){
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start(){
        while (true){
            System.out.print("? ");
            String command = scanner.nextLine();

            if(command.equals("Quit")){
                break;
            }

            processCommand(command);
        }
    }

    public void processCommand(String command){
        switch(command){
            case "Add":{
                add();
                break;
            }
            case "Observation":{
                observation();
                break;
            }
            case "All":{
                getObservationData();
                break;
            }
            case "One":{
                getBirdDetails();
                break;
            }
        }
    }

    public void add(){
        System.out.print("Name: ");
        String englishBirdsName = scanner.nextLine();

        System.out.print("Name in Latin: ");
        String latinBirdsName = scanner.nextLine();

        birds.addBird(englishBirdsName,latinBirdsName);
    }

    public void observation(){
        System.out.print("Bird? ");
        String birdsName = scanner.nextLine();

        birds.addObservation(birdsName);
    }

    public void getObservationData(){
        for(String i : birds.getObservation().keySet()){
            for(String j : birds.getBirds().keySet()){
                if(i.equals(j)){
                    System.out.println(j + " (" + birds.getBirds().get(j) + "):" + birds.getObservation().get(i) + " observations");
                }
            }
        }
    }

    public void getBirdDetails(){
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();

        for(String i : birds.getObservation().keySet()){
            if(i.equals(birdName)){
                for(String j : birds.getBirds().keySet()){
                    if(j.equals(birdName)){
                        System.out.println(j + " (" + birds.getBirds().get(j) + "):" + birds.getObservation().get(i) + " observations");
                    }
                }
            }
        }
    }
}
