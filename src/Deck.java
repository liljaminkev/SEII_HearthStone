//Deck contains an arrayList of cards, a counter
import java.util.*;
public class Deck extends Cards{
    /*
    protected List<Card> deck;
    private Random rand;

    public Deck(List<Card> cards){
        deck = new ArrayList<Card>();
        rand = new Random();
        setupDeck(cards);
    }

    //Helper methods
    public void setupDeck(List<Card> cards){

        //Deals player 5 random cards
        for(int count = 0; count < 5; count++){
            deck.add(cards.get(rand.nextInt(cards.size())));
        }
    }

    public Card returnTopCard(){
        return deck.get(deck.size() - 1);
    }
    */
    public Card drawCard()
    {
        Card returnCard;
        returnCard = this.showCard(this.getNumCards());
        removeCard(returnCard);
        return returnCard;
    }
}
