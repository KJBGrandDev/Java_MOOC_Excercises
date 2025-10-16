package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_17_SortThemCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public void sort(){

        List<Card> sortedList = cardList.stream().sorted(Comparator.comparing(Card::getValue)).collect(Collectors.toCollection(ArrayList::new));

        for(Card i : sortedList){
            System.out.println(i);
        }
    }
}
