package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_12_SensorsAndTemperature;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean on;

    public TemperatureSensor(){
        this.on = false;
    }

    public boolean isOn(){
        return this.on;
    }

    public void setOn(){
        this.on = true;
    }

    public void setOff(){
        this.on = false;
    }

    public int read(){
        if(on){
            int random = new Random().nextInt(61);
            return random - 30;
        } else {
            throw new IllegalStateException();
        }
    }
}
