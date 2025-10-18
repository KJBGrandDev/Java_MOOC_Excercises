package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_08_FirstPackages.mooc;

import Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_08_FirstPackages.mooc.logic.ApplicationLogic;
import Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_08_FirstPackages.mooc.ui.TextInterface;
import Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_08_FirstPackages.mooc.ui.UserInterface;

public class Main {
    public static void main(String[] args){
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
