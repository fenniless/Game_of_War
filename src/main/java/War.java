import java.util.ArrayList;
import java.util.Scanner;

public class War {
    private Player player;
    private Player dealer;
    private Scanner input = new Scanner(System.in);
    private ArrayList<Card> pile = new ArrayList<Card>();

    public void setup(){
        Deck deck = new Deck();
        deck.shuffle();
        Hand hand1 = new Hand(deck);
        Hand hand2 = new Hand(deck);
        player = new Player(hand1);
        dealer = new Player(hand2);
    }

    public void play() {
        setup();
        System.out.println("I have dealt us both "+ player.getHand().getNumberOfCards().toString()+" cards. Let's Play!\nReady to DRAW?");
        input.nextLine();
        while(!player.getHand().isEmpty() || player.getHand().getNumberOfCards()==52){
            pile.clear();
            draw();
            input.nextLine();
        }
        evaluateWinner();
    }

    public void draw(){
        Card card1 = player.draw();
        Card card2 = dealer.draw();
        pile.add(card1);
        pile.add(card2);
        System.out.println(card1.toString()+ " VS "+card2.toString());
        if(card1.getCardValue() == card2.getCardValue()){
            haveWar();
            System.out.println("You have "+player.getHand().getNumberOfCards()+" cards in your deck.");
        } else if (card1.getCardValue() > card2.getCardValue()){
            System.out.println("You won the Draw!");
            player.getHand().addAPileOfCards(pile);
        } else {
            System.out.println("Dealer won the Draw!");
            dealer.getHand().addAPileOfCards(pile);
        }
    }
    public void haveWar(){
        System.out.print("This is WAR! We both draw three cards face down...");
        input.nextLine();
        drawThreeFaceDown();
        input.nextLine();
        drawWar();
    }

    public void drawWar(){
        Card card5 = player.draw();
        Card card6 = dealer.draw();
        pile.add(card5);
        pile.add(card6);
        System.out.println(card5.toString()+ " VS "+card6.toString());
        if(card5.getCardValue() == card6.getCardValue()){
            System.out.println("\nWar again!!??!!");
            haveWar();
        } else if (card5.getCardValue() > card6.getCardValue()){
            System.out.println("\nYou won the War! Here are is the pile!");
            printPile();
            player.getHand().addAPileOfCards(pile);
        } else {
            System.out.println("\nDealer won the War! They get the pile.");
            printPile();
            dealer.getHand().addAPileOfCards(pile);
        }
    }

    public void printPile(){
        for(int i=0 ; i<pile.size()-1 ; i+=2){
            System.out.println(pile.get(i)+" VS "+pile.get(i+1));
        }
    }

    public void evaluateWinner(){
        if(player.getHand().getNumberOfCards()>dealer.getHand().getNumberOfCards()){
            System.out.println("You Won! Play Again?");
            input.nextLine();
            play();
        }   else {
            System.out.println("Dealer Won. Play Again?");
            input.nextLine();
            play();
        }
    }
    public void drawThreeFaceDown(){
        if(player.getHand().getNumberOfCards()<4){
            System.out.println("Looks like you don't have enough cards for war.");
            evaluateWinner();
        } else if (dealer.getHand().getNumberOfCards()<4){
            System.out.println("Looks like the Dealer doesn't have enough cards for war.");
            evaluateWinner();
        }
            Card card3 = player.draw();
            Card card4 = dealer.draw();
            pile.add(card3);
            pile.add(card4);
            System.out.print("[ ][ ][ ][ ][ ] VS [ ][ ][ ][ ][ ]");
            input.nextLine();
            Card card5 = player.draw();
            Card card6 = dealer.draw();
            pile.add(card5);
            pile.add(card6);
            System.out.print("[ ][ ][ ][ ][ ] VS [ ][ ][ ][ ][ ]");
            input.nextLine();
            Card card7 = player.draw();
            Card card8 = dealer.draw();
            pile.add(card7);
            pile.add(card8);
            System.out.print("[ ][ ][ ][ ][ ] VS [ ][ ][ ][ ][ ]\nOkay, final draw...");
    }
}
