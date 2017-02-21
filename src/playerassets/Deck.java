//Deck contains an arrayList of cards, a counter
package playerassets;
import java.util.*;
import cards.Card;
import java.io.Serializable;
public class Deck extends Cards implements Serializable{
    public Card drawCard()
    {
        Card returnCard;
        returnCard = this.showCard(this.getNumCards());
        removeCard(returnCard);
        return returnCard;
    }
}
