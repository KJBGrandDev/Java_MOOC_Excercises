package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_05_PlayerAndBot;

public class Player {
    private String name;

    public void play(){
        System.out.println("We have no game yet");
    }

    public void printName(){
        System.out.println("Player name: " + this.name);
    }
}
