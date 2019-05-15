public class Player {
    private Hand hand;

    public Player(Hand hand){
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }

    public Card draw(){
        Card card = this.getHand().getACard(0);
        this.getHand().removeACard(0);
        return card;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
