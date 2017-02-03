import java.util.ArrayList;
import java.util.List;
public abstract class Cards
{
    private List<Card> cards;
    private int numCards;


    public Cards()
    {
      cards = new ArrayList<Card>();
      numCards = 0;
    }

    //add new card to hand
    public void addTo(int index, Card newCard)
    {
      cards.add(index, newCard);
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

    public void removeFrom(Card cardObject)
    {
      cards.remove(cardObject);
      numCards--;
    }
}
