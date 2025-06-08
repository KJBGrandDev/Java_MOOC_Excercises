package Part_04_Introduction_To_OOP.part_04_08_DecreasingCounter;

public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();
        counter.decrement();
        counter.decrement();
    }
}
