package playerassets;
import cards.Card;
public class Hand extends Cards{
    public Card playCard(Card cardToBePlayed)
    {
        Card returnCard;
        returnCard = cardToBePlayed;
        this.removeCard(cardToBePlayed);
        return returnCard;
    }
}
