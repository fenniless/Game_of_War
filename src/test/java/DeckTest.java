import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    Deck deck;

    @BeforeEach
    void setUp() {
        deck = new Deck();
    }

    @Test
    void toString1() {
        String string = "TWO HEARTS\n" +
                "THREE HEARTS\n" +
                "FOUR HEARTS\n" +
                "FIVE HEARTS\n" +
                "SIX HEARTS\n" +
                "SEVEN HEARTS\n" +
                "EIGHT HEARTS\n" +
                "NINE HEARTS\n" +
                "TEN HEARTS\n" +
                "JACK HEARTS\n" +
                "QUEEN HEARTS\n" +
                "KING HEARTS\n" +
                "ACE HEARTS\n" +
                "TWO DIAMONDS\n" +
                "THREE DIAMONDS\n" +
                "FOUR DIAMONDS\n" +
                "FIVE DIAMONDS\n" +
                "SIX DIAMONDS\n" +
                "SEVEN DIAMONDS\n" +
                "EIGHT DIAMONDS\n" +
                "NINE DIAMONDS\n" +
                "TEN DIAMONDS\n" +
                "JACK DIAMONDS\n" +
                "QUEEN DIAMONDS\n" +
                "KING DIAMONDS\n" +
                "ACE DIAMONDS\n" +
                "TWO CLUBS\n" +
                "THREE CLUBS\n" +
                "FOUR CLUBS\n" +
                "FIVE CLUBS\n" +
                "SIX CLUBS\n" +
                "SEVEN CLUBS\n" +
                "EIGHT CLUBS\n" +
                "NINE CLUBS\n" +
                "TEN CLUBS\n" +
                "JACK CLUBS\n" +
                "QUEEN CLUBS\n" +
                "KING CLUBS\n" +
                "ACE CLUBS\n" +
                "TWO SPADES\n" +
                "THREE SPADES\n" +
                "FOUR SPADES\n" +
                "FIVE SPADES\n" +
                "SIX SPADES\n" +
                "SEVEN SPADES\n" +
                "EIGHT SPADES\n" +
                "NINE SPADES\n" +
                "TEN SPADES\n" +
                "JACK SPADES\n" +
                "QUEEN SPADES\n" +
                "KING SPADES\n" +
                "ACE SPADES\n";
        Assert.assertEquals(deck.toString(), string);
    }
}