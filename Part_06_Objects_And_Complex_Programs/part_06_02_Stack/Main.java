package Part_06_Objects_And_Complex_Programs.part_06_02_Stack;

public class Main {
    public static void main(String[] args){
        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}
