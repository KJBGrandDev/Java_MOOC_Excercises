package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_17_SortThemCards;

import Part_09_Advanced_OOP.Part_09_01_ABC.B;

import java.util.*;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand> {
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

    public int compareTo(Hand hand){
        int thisValue = cardList.stream().mapToInt(Card::getValue).reduce(0, (a,b) -> a + b);
        int otherValue = hand.cardList.stream().mapToInt(Card::getValue).reduce(0, (a,b) -> a + b);

        if(thisValue < otherValue){
            return -1;
        } else if (thisValue == otherValue){
            return 0;
        }
        return 1;
    }

    public void sortBySuit(){
        BySuitInValueOrder sortBySuit = new BySuitInValueOrder();

        Collections.sort(cardList,sortBySuit);
    }
}
