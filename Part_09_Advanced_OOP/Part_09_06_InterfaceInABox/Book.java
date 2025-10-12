package Part_09_Advanced_OOP.Part_09_06_InterfaceInABox;

public class Book implements Packable{
    private String authorName;
    private String bookName;
    private double weight;

    public Book(String authorName, String bookName, double weight){
        this.authorName = authorName;
        this.bookName = bookName;
        this.weight = weight;
    }

    public double weight(){
        return this.weight;
    }

    public String toString(){
        return authorName + ": " + bookName;
    }
}
