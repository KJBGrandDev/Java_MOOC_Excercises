package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_14_Literature;

public class Book{
    private String bookName;
    private int ageRecommendation;

    public Book(String bookName, int ageRecommendation){
        this.bookName = bookName;
        this.ageRecommendation = ageRecommendation;
    }

    public String getBookName(){
        return this.bookName;
    }

    public int getAgeRecommendation(){
        return this.ageRecommendation;
    }
}
