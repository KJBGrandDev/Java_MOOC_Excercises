package Part_04_Introduction_To_OOP.part_04_31_SportStatistics;

public class Sports {
    private String team1;
    private String team2;
    private int gameCount = 0;
    private int wins;
    private int loss;

    public Sports(String team1, String team2, int wins, int loss){
        this.team1 = team1;
        this.team2 = team2;
        this.wins = wins;
        this.loss = loss;
    }

    public int gameCount(String find,String team1, String team2){
        if(find.equals(team1) || find.equals(team2)){
            this.gameCount++;
        }
        return gameCount;
    }

}
