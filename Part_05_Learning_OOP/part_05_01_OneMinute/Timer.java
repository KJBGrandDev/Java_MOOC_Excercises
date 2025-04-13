package Part_05_Learning_OOP.part_05_01_OneMinute;

public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;

    public Timer(){
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance(){
        this.hundredths.advance();

        if(this.hundredths.getValue() == 0){
            this.seconds.advance();
        }
    }

    public String toString(){
        return seconds + ":" + hundredths;
    }
}
