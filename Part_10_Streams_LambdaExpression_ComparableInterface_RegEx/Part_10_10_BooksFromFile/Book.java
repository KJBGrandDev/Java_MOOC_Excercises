package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_10_BooksFromFile;

public class Book {
    private String name;
    private int publishingYear;
    private int pageCount;
    private String author;

    public Book(String name, int publishingYear, int pageCount, String author){
        this.name = name;
        this.publishingYear = publishingYear;
        this.pageCount = pageCount;
        this.author = author;
    }

    public String getName(){
        return this.name;
    }

    public int getPublishingYear(){
        return this.publishingYear;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getPageCount(){
        return this.pageCount;
    }
}
