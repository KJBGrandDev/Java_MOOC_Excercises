package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_12_SensorsAndTemperature;

public class StandardSensor implements Sensor{
    private boolean on;
    private int num;

    public StandardSensor(int num){
        this.on = true;
        this.num = num;
    }

    public boolean isOn(){
        return on;
    }

    public void setOn(){
        this.on = true;
    }

    public void setOff(){
        this.on = true;
    }

    public int read(){
        return this.num;
    }
}
