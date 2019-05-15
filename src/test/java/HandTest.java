import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HandTest {
    Deck deck = new Deck();
    private Hand hand = new Hand(deck);


    @Before
    public void setup(){
        Deck deck = new Deck();
        Hand hand = new Hand(deck);
    }

    @org.junit.Test
    public void removeACardTest() {
        //second card in the deck
        Card nextCard = hand.getACard(1);

        //when
        hand.removeACard(0);

        //then the second card is now the first card
        Assert.assertEquals(nextCard, hand.getACard(0));
    }

    @org.junit.Test
    public void addACardTest() {
        Card card = new Card(Card.Rank.KING, Card.Suit.DIAMONDS);
        hand.addACard(card);

        Assert.assertEquals(card, hand.getACard(26));
    }

    @org.junit.Test
    public void getACardTest() {
        Assert.assertEquals(hand.getACard(0).toString(), "ACE SPADES");
    }

    @org.junit.Test
    public void getNumberOfCardsTest() {
        Integer numOfCards = 26;
        Assert.assertEquals(hand.getNumberOfCards(), numOfCards);
    }

    @org.junit.Test
    public void clearHandTest() {
        hand.clearHand();
        Integer numOfCards = 0;
        Assert.assertEquals(hand.getNumberOfCards(), numOfCards);
    }

    @org.junit.Test
    public void isEmptyTest() {
        Assert.assertFalse(hand.isEmpty());
    }

    @org.junit.Test
    public void addAPileOfCardsTest() {
        Card card1 = new Card(Card.Rank.KING, Card.Suit.DIAMONDS);
        Card card2 = new Card(Card.Rank.QUEEN, Card.Suit.DIAMONDS);
        ArrayList<Card> pile = new ArrayList<Card>();
        pile.add(card1);
        pile.add(card2);

        hand.addAPileOfCards(pile);

        Assert.assertEquals(card1, hand.getACard(26));
        Assert.assertEquals(card2, hand.getACard(27));

    }

    @org.junit.Test
    public void toString1Test() {
        System.out.println(hand.toString());
        String string = "ACE SPADES, KING SPADES, QUEEN SPADES, JACK SPADES, TEN SPADES, NINE SPADES, EIGHT SPADES, SEVEN SPADES, SIX SPADES, FIVE SPADES, FOUR SPADES, THREE SPADES, TWO SPADES, ACE CLUBS, KING CLUBS, QUEEN CLUBS, JACK CLUBS, TEN CLUBS, NINE CLUBS, EIGHT CLUBS, SEVEN CLUBS, SIX CLUBS, FIVE CLUBS, FOUR CLUBS, THREE CLUBS, TWO CLUBS";
        Assert.assertEquals(hand.toString(), string);
    }
}