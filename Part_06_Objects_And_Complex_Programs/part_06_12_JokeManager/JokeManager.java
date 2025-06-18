package Part_06_Objects_And_Complex_Programs.part_06_12_JokeManager;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager(){
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke){
        jokes.add(joke);
    }

    public String drawJoke(){
        if(jokes.isEmpty()){
            System.out.println("Jokes are in short supply");
        }
        Random random = new Random();
        int index = random.nextInt(jokes.size());

        return jokes.get(index);
    }

    public void printJokes(){
        for(String i: jokes){
            System.out.println(i);
        }
    }
}
