import org.junit.Assert;

import static org.junit.Assert.*;

public class HandTest {

    @org.junit.Test
    public void removeACardTest() {
        //given cards
        Deck deck = new Deck();
        Hand hand = new Hand(deck);
            //second card in the deck
        Card nextCard = hand.getACard(1);

        //when
        hand.removeACard(0);

        //then the second card is now the first card
        Assert.assertEquals(nextCard, hand.getACard(0));
    }
}