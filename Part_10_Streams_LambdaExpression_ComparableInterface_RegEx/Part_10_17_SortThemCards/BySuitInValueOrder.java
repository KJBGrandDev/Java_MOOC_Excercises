package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_17_SortThemCards;

import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card c1,Card c2){
        if(c1.getSuit().ordinal() < c2.getSuit().ordinal()){
            return -1;
        } else if(c1.getSuit().ordinal() == c2.getSuit().ordinal()){
            return 0;
        }
        return 1;
    }
}
