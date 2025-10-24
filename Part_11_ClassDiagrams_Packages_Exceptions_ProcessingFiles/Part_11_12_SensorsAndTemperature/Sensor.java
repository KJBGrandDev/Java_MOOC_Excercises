package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_12_SensorsAndTemperature;

public interface Sensor {
    boolean isOn();
    void setOn();
    void setOff();
    int read();
}
