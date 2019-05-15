import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Deck deck = new Deck();
    private Hand hand = new Hand(deck);
    Player player = new Player(hand);


    @Before
    public void setup(){
        Deck deck = new Deck();
        Hand hand = new Hand(deck);
    }

    @Test
    void getHandTest() {
        String string = "ACE SPADES, KING SPADES, QUEEN SPADES, JACK SPADES, TEN SPADES, NINE SPADES, EIGHT SPADES, SEVEN SPADES, SIX SPADES, FIVE SPADES, FOUR SPADES, THREE SPADES, TWO SPADES, ACE CLUBS, KING CLUBS, QUEEN CLUBS, JACK CLUBS, TEN CLUBS, NINE CLUBS, EIGHT CLUBS, SEVEN CLUBS, SIX CLUBS, FIVE CLUBS, FOUR CLUBS, THREE CLUBS, TWO CLUBS";
        Assert.assertEquals(player.getHand().toString(), string);
    }

    @Test
    void drawTest() {
        String string = "ACE SPADES";
        Assert.assertEquals(player.draw().toString(), string);
    }

    @Test
    void setHandTest() {
        Deck deck2 = new Deck();
        Hand hand2 = new Hand(deck2);
        Hand hand3 = new Hand(deck2);
        hand3.clearHand();
        Player player2 = new Player(hand2);
        player2.setHand(hand3);

        Assert.assertTrue(player2.getHand().isEmpty());

    }
}