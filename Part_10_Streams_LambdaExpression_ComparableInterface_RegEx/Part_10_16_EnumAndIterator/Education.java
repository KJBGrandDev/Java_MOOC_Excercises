package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_16_EnumAndIterator;

public enum Education {
    PHD("Doctoral Degree"),
    MA("Masters Degree"),
    BA("Bachelors Degree"),
    HS("Highschool Diploma");

    private final String code;

    private Education(String code){
        this.code = code;
    }

    public String getCode(){
        return this.code;
    }
}
