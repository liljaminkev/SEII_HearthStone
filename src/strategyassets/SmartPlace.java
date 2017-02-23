/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormwars;
/**
 *
 * @author bashi.aquino
 */

//smart move to return offensive moves
public class SmartPlace extends Strategy
{
    @Override
    public Move getLegalMove(Player playerA)
    {
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
                return smartPlace.placeCard(playerHand,card,cardIndex,playerA.getBattleField());
            }

        }
        }while(cardIndex!=7);

        return null;

    }
}
