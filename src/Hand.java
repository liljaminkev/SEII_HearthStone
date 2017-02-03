//hand contains an arrayList of cards, a counter
import java.util.ArrayList;
import java.util.List;

public class Hand{
  private List<Card> hand;
  int numCards;


  public Hand()
  {
    hand = new ArrayList<Card>();
    numCards = 0;
  }

  //add new card to hand
  public void addToHand(Card newCard)
  {
    hand.add(newCard);
    numCards++;
  }

  //returns a card from index location
  public Card showCard(int index)
  {
    return hand.get(index);
  }

  public int getNumCards()
  {
      return numCards;
  }

  public void removeFromHand(int cardIndex)
  {
    hand.add(cardIndex);
    numCards--;
  }


}
