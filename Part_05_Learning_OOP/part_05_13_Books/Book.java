package Part_05_Learning_OOP.part_05_13_Books;

public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }

        if(!(compared instanceof Book)){
            return false;
        }

        Book comparedBook = (Book) compared;
        if(this.getName().equals(comparedBook.getName())&& this.getPublicationYear() == comparedBook.getPublicationYear()){
            return true;
        }
        return false;
    }

}
