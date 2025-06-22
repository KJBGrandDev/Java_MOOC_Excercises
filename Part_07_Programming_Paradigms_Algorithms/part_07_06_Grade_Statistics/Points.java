package Part_07_Programming_Paradigms_Algorithms.part_07_06_Grade_Statistics;

import java.util.ArrayList;
import java.util.HashMap;

public class Points {
    private int points;
    private HashMap<Integer,Integer> gradeDistribution;
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> passingList;

    public Points(){
        this.points = 0;
        this.pointsList = new ArrayList<>();
        this.passingList = new ArrayList<>();
        this.gradeDistribution = new HashMap<>();
    }

    public ArrayList<Integer> getPointsList(){
        return pointsList;
    }

    public void add(int points){
        if(points >= 0 && points <= 100){
            if(points >= 50){
                passingList.add(points);
            }
            pointsList.add(points);
        }
    }

    public int totalPoints(){
        int totalPoints = 0;
        for(Integer i : pointsList){
            totalPoints += i;
        }

        return totalPoints;
    }

    public int passingTotalPoints(){
        int totalPoints = 0;
        for(Integer i : passingList){
            totalPoints += i;
        }

        return totalPoints;
    }

    public double average(){
        double average = (double)totalPoints() / pointsList.size();

        return average;
    }

    public String averagePassing(){
        if(passingList.isEmpty()){
            String empty = "-";
            return empty;
        }
        double average = (double)passingTotalPoints() / passingList.size();

        return String.valueOf(average);
    }

    public double passPercentage(){
        double percentage = (double) (passingList.size() * 100) / pointsList.size();

        return percentage;
    }

    public int getGradeDistributionSize(){
        return gradeDistribution.size();
    }

    public void GradeDistribution(){
        int[] grades = new int[6];

        for(Integer i : pointsList){
            if(i < 50){
                grades[0]++;
            } else if(i < 60){
                grades[1]++;
            } else if(i < 70){
                grades[2]++;
            } else if(i < 80){
                grades[3]++;
            } else if(i < 90){
                grades[4]++;
            } else if(i <= 100){
                grades[5]++;
            }
        }
        for(int i = 0; i < grades.length; i++){
            gradeDistribution.put(i, grades[i]);
        }
    }

    public Integer getGradeDistributionValue(int key){
        return gradeDistribution.get(key);
    }
}
