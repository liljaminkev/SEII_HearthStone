package playerassets;
import cards.Card;
import java.io.Serializable;
public class Hand extends Cards implements Serializable{
    public Card playCard(Card cardToBePlayed)
    {
        Card returnCard;
        returnCard = cardToBePlayed;
        this.removeCard(cardToBePlayed);
        return returnCard;
    }
}
