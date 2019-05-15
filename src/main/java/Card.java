import java.util.ArrayList;
import java.util.List;

public class Card{

    public enum Suit {HEARTS, DIAMONDS, CLUBS, SPADES}
    public enum Rank {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}

    List<Integer> cardValueList = new ArrayList<Integer>();

    private Suit cardSuit;
    private Rank cardRank;
    private Integer cardValue;

    public Card(Rank cardRank, Suit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public Card(Rank cardRank, Suit cardSuit, Integer cardValue){
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
        this.cardValue = cardValue;
    }

    public Rank getRank() {
        return this.cardRank;
    }

    public Suit getSuit() {
        return this.cardSuit;
    }

    Integer getCardValue(){return this.cardValue;}

    void createCardValue(){
        cardValueList.add(2);
        cardValueList.add(3);
        cardValueList.add(4);
        cardValueList.add(5);
        cardValueList.add(6);
        cardValueList.add(7);
        cardValueList.add(8);
        cardValueList.add(9);
        cardValueList.add(10);
        cardValueList.add(11);
        cardValueList.add(12);
        cardValueList.add(13);
        cardValueList.add(14);
    }

    @Override
    public String toString(){
        String cardVal = getRank().toString();
        cardVal = cardVal + " " + getSuit().toString();
        return cardVal;
    }
}
