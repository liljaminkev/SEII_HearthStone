//Deck contains an arrayList of cards, a counter
package playerassets;
import java.util.*;
import cards.Card;
public class Deck extends Cards{
    public Card drawCard()
    {
        Card returnCard;
        returnCard = this.showCard(this.getNumCards());
        removeCard(returnCard);
        return returnCard;
    }
}
