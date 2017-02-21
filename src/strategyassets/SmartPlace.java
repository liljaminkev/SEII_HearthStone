package strategyassets;


import playerassets.Player;
import playerassets.Hand;
import playerassets.Deck;
import cards.Card;
import moveassets.Move;

//smart move to return offensive moves
public class SmartPlace implements Strategy
{
    public Move getLegalMove(Player playerA)
    {
//        Move smartPlace = new Move();
        Move smartPlace = new MovePlaceCard();
        Deck playerDeck = playerA.getDeck();
        Hand playerHand = playerA.getHand();
        Card card;
        int cardcost=0;
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
                smartPlace.placeCard(playerHand,card,cardIndex,playerA.getBattleField());
                cardIndex++;
            }

        }
        }while(cardIndex!=7)

        return smartPlace;
    }
}
