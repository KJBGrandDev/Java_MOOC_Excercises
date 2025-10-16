package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_17_SortThemCards;

public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    public int compareTo(Card card){
        if(this.value < card.getValue()){
            return -1;
        } else if (this.value == card.getValue()){
            if(this.suit.ordinal() < card.suit.ordinal()){
                return -1;
            } else {
                return 1;
            }
        }
        return 1;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

}