package strategyassets;


import playerassets.Player;
import playerassets.Hand;
import playerassets.Deck;
import cards.Card;
import moveassets.MovePlaceCard;
import moveassets.Move;

//smart move to return offensive moves
public class StrategySmartPlace extends Strategy
{
    public Move getLegalMove(Player playerA)
    {
        Deck playerDeck = playerA.getDeck();
        Hand playerHand = playerA.getHand();
        Move movePlaceCard = null;
        Card card;
        int cardCost=0;
        int cardIndex=0;

        //check if battlefield is full
        if (playerDeck.getNumCards()==7)
            return null;

        //get the index of battlefield
        cardIndex=playerDeck.getNumCards();

        //loop cards in hand
        do {
        for(int counter=0; counter < playerHand.getNumCards(); counter++)
        {
            card=playerHand.showCard(counter);

            //if cardCost==0, put card in the battlefield
            if (card.getCardCost()==0)
            {
                movePlaceCard = new MovePlaceCard(playerHand,card,cardIndex,playerA.getBattleField());
                cardIndex++;
            }

        }
        }while(cardIndex!=7);

        return movePlaceCard;
    }

    @Override
    public Move getLegalMove(Player playerA, Player playerB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
