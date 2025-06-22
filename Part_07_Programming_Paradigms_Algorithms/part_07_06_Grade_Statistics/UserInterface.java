package Part_07_Programming_Paradigms_Algorithms.part_07_06_Grade_Statistics;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Points pointsList;

    public UserInterface(Scanner scanner, Points pointsList){
        this.scanner = scanner;
        this.pointsList = pointsList;
    }

    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if(input == -1){
                break;
            } else {
                pointsList.add(input);
            }
        }
        tallyMark();
    }

    public void tallyMark(){
        System.out.println("Point average (all): " + pointsList.average());
        System.out.println("Point average (passing): " + pointsList.averagePassing());
        System.out.println("Pass percentage: " + pointsList.passPercentage());
        gradeDistributionUI();
    }

    public void gradeDistributionUI(){
        pointsList.GradeDistribution();

        System.out.println("Grade Distribution: ");

        for(int i = pointsList.getGradeDistributionSize() - 1; i >= 0; i--){
            if(i == pointsList.getGradeDistributionSize() -1){
                System.out.print(i + ": ");
            } else{
                System.out.print("\n" + i + ": ");
            }

            int stars = pointsList.getGradeDistributionValue(i);
            for(int j = 0; j < stars;j++){
                System.out.print("*");
            }
        }
    }
}
