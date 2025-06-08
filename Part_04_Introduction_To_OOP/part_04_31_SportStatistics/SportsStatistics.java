package Part_04_Introduction_To_OOP.part_04_31_SportStatistics;

import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
public class SportsStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scanner.nextLine();
        System.out.println("Team: ");
        String teamName = scanner.nextLine();

        int gameCount = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get("Part_04_Introduction_To_OOP/part_04_31_SportStatistics/" + fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                String team1 = parts[0];
                String team2 = parts[1];
                int team1Points = Integer.parseInt(parts[2]);
                int team2Points = Integer.parseInt(parts[3]);

                if (team1.equals(teamName)) {
                    gameCount++;
                    if (team1Points > team2Points) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (team2.equals(teamName)){
                    gameCount++;
                    if(team1Points < team2Points){
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
                System.out.println("Games: " + gameCount);
                System.out.println("Wins: " + wins);
                System.out.println("Losses: " + losses);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}