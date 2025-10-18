package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_08_FirstPackages.mooc.logic;

import Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_08_FirstPackages.mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui){
        this.ui = ui;
    }

    public void execute(int times){
        for(int i = 0; i < times; i++){
            System.out.println("Application logic is working");
            this.ui.update();
        }
    }
}
