package Part_11_ClassDiagrams_Packages_Exceptions_ProcessingFiles.Part_11_12_SensorsAndTemperature;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensorList;
    private List<Integer> readings;

    public AverageSensor(){
        this.sensorList = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor sensor){
        sensorList.add(sensor);
    }

    public boolean isOn(){
        boolean isOn = false;
        for(Sensor i: this.sensorList){
            if(!i.isOn()){
                return isOn;
            }
        }
        isOn = true;
        return isOn;
    }

    public void setOn(){
        for(Sensor i: this.sensorList){
            i.setOn();
        }
    }

    public void setOff(){
        for(Sensor i: this.sensorList){
            i.setOff();
        }
    }

    public int read(){
        if(this.isOn()){
            int num = 0;

            for(Sensor i: this.sensorList){
                num += i.read();
            }

            int average = num / this.sensorList.size();
            readings.add(average);
            return average;
        } else {
            throw new IllegalStateException();
        }
    }

    public List<Integer> readings(){
        return this.readings;
    }
}
