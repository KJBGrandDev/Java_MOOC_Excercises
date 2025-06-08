package Part_04_Introduction_To_OOP.part_04_10_Song;

public class Song {
    private String name;
    private int lengthInSeconds;

    public Song(String name, int length){
        this.name = name;
        this.lengthInSeconds = length;
    }

    public String name(){
        return this.name;
    }

    public int length(){
        return this.lengthInSeconds;
    }
}
