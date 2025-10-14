package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_12_StudentsOnAlphabeticalOrder;

public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Student students){
       int num = this.name.compareTo(students.name);

       return num;
    }

    @Override
    public String toString() {
        return name;
    }

}
