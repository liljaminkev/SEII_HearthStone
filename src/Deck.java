//Deck contains an arrayList of cards, a counter
import java.util.ArrayList;
import java.util.List;

public class Deck{
  private List<Card> deck;
  int numCards;


  public Deck()
  {
    deck = new ArrayList<Card>();
    numCards = 0;
  }

  //add new card to Deck
  public void addToDeck(Card newCard)
  {
    deck.add(newCard);
    numCards++;
  }

  //returns a card from index location
  public Card showCard(int index)
  {
    return deck.get(index);
  }

  public int getNumCards()
  {
      return numCards;
  }

  //plays a card from index and removes it from the Deck
  /* not needed
  public Card playCard(int index)
  {
    Card cardToBeReturned;
    cardToBeReturned = Deck.get(index - 1);
    Deck.remove(index-1);
    return cardToBeReturned;
  }
  */

  //retrive card from index number


}
