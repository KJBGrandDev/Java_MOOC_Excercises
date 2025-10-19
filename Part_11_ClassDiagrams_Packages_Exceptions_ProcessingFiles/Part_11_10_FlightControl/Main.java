package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl;

import Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.Logic.FlightControl;
import Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_10_FlightControl.UI.TextInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FlightControl newFlightControl = new FlightControl();
        TextInterface newTextInterface = new TextInterface(scanner, newFlightControl);

        newTextInterface.start();
    }
}
