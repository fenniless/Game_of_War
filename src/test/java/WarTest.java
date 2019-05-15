import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WarTest {
    private Player player;
    private Player dealer;
    private Scanner input = new Scanner(System.in);
    private ArrayList<Card> pile = new ArrayList<Card>();

    @BeforeEach
    void setUp() {
        War war = new War();
        war.setup();
    }

//    @Test
//    public void setupTest() {
//        War war = new War();
//        war.setup();
//        System.out.println(player.getHand().toString());
//        Assert.assertFalse(player.getHand().isEmpty());
//    }
//
//    @Test
//    void evaluateWinner() {
//        War war = new War();
//        war.play();
//        war.evaluateWinner();
//    }

}