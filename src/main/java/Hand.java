import java.util.*;

public class Hand {

    public List<Card> myHand = new ArrayList<Card>();

    public Hand(Deck deck){
        for(int i=0; i<26; i++){
            myHand.add(deck.dealCard());
        }
    }

    public void addACard(Card card){
        myHand.add(card);
    }

    public Card getACard(Integer index){
        return (Card) myHand.get(index);
    }

    public Integer getNumberOfCards(){
        return myHand.size();
    }

    public void clearHand(){
        myHand.clear();
    }

    public void removeACard(Integer index){
        Card card = myHand.get(index);
        myHand.remove(card);
    }

    public boolean isEmpty() {
        return myHand.isEmpty();
    }

    public void addAPileOfCards(ArrayList<Card> cards){
        myHand.addAll(cards);
    }

    @Override
    public String toString(){
        if(myHand.size() > 0) {
            String results = getACard(0).toString();
            for (int i = 1; i < myHand.size(); i++) {
                results += ", " + getACard(i);
            }
            return results;
        }
        return null;
    }
}

