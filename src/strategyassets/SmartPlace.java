package strategyassets;


import player.Player;
import player.Hand;
import cards.Deck;
import cards.Card;

//smart move to return offensive moves
public class SmartPlace implements Strategy
{
    //Places mob with highest atk power and  count that is <= player
    //returns -1 if no cards to play
    //else 1
    public int getLegalMove(Player playerA)
    {
        int highestAttackPower = -1;
        int highestCrystalCount = -1;
        Move smartPlace = new Move();
        Deck playerDeck = playerA.getDeck();
        Hand playerHand = playerA.getHand();
        int highestIndex = -1;
        Card card;

        //player loses if has no cards to play or draw
        if(playerHand.getNumCards() == 0 && playerDeck.getNumCards() == 0)
        return -1;

        if(playerHand.getNumCards() != 0)
        {
            for(int cardIndex = 0; cardIndex < playerHand.getNumCards(); cardIndex++)
            {
                card = playerHand.showCard(cardIndex);
                if (card.getAttackPoints() > highestAttackPower && card.getGemCost() <= playerA.getCurrentCrystals())
                {
                    highestAttackPower = card.getAttackPoints();
                    highestIndex = cardIndex;
                }
            }
            if (highestIndex > -1)
            {
                smartPlace.placeCard(playerHand, highestIndex, playerA.getBattleField(), 0);
                return 1;
            }

        }


        return 0;
    }
}
