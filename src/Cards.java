import java.util.ArrayList;
import java.util.List;
public abstract class Cards
{
    private List<Card> cards;
    int numCards;


    public Cards()
    {
      cards = new ArrayList<Card>();
      numCards = 0;
    }

    //add new card to hand
    public void addTo(Card newCard)
    {
      cards.add(newCard);
      numCards++;
    }

    //returns a card from index location
    public Card showCard(int index)
    {
      return cards.get(index);
    }

    public int getNumCards()
    {
        return numCards;
    }

    public void removeFrom(int cardIndex)
    {
      cards.remove(cardIndex);
      numCards--;
    }
}
