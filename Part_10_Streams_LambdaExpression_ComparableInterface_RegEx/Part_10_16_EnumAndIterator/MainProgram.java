package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_16_EnumAndIterator;

public class MainProgram {
    public static void main(String[] args){
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
}
