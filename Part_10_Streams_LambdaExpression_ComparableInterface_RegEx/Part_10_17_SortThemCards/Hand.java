package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_17_SortThemCards;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cardList;

    public Hand(){
        this.cardList = new ArrayList<>();
    }

    public void add(Card card){
        this.cardList.add(card);
    }

    public void print(){
        StringBuilder sb = new StringBuilder();
        for(Card i: this.cardList){
            sb.append(i).append("\n");
        }
        System.out.print(sb.toString());
    }
}
