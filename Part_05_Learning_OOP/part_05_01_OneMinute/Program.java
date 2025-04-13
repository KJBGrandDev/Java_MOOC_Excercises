package Part_05_Learning_OOP.part_05_01_OneMinute;

public class Program {
    public static void main(String[] args){
        Timer timer = new Timer();
        while(true){
            System.out.println(timer);
            timer.advance();

            try{
                Thread.sleep(100);
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
}

