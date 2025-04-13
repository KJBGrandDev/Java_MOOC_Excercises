package Part_05_Learning_OOP.part_05_02_Book;

public class Book {
    private String author;
    private String title;
    private int pages;

    public Book(String author, String title, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getName(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    public String toString(){
        return this.author + ", " + this.title + ", " + this.pages + " pages";
    }
}
