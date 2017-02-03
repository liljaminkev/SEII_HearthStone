import java.util.ArrayList;
import java.util.List;
public abstract class Cards
{
    private List<Card> cards;

    public Cards()
    {
      cards = new ArrayList<Card>();

    }


    //add new card to hand
    public void addCard(int index, Card newCard)
    {
      cards.add(index, newCard);
      numCards++;
    }

    //returns a card from index location
    public Card showCard(int index)
    {
      return cards.get(index);
    }

    //Returns the amount of elements in array.
    public int getSize()
    {
        return cards.size();
    }


    public void removeCard(Card cardObject)
    {
      cards.remove(cardObject);
    }
}
