package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_15_RegularExpressions;

public class Checker {
    public boolean isDayOfWeek(String string){
        String regEx = "(mon|tue|wed|thu|fri|sat|sun)";

        return string.matches(regEx);
    }

    public boolean allVowels(String string){
        String regEx = "^[aeiou]+$";

        return string.matches(regEx);
    }

    public boolean timeOfDay(String string){
        String regEx = "((([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9])|24:00:00)";

        return string.matches(regEx);
    }
}
