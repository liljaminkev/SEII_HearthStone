package strategyassets;

import moveassets.Move;
import playerassets.Player;

//smart move to return offensive moves
public class SmartMove extends Strategy
{/*
=======
{
>>>>>>> origin/master
    //returns card with lowest wait time
    /*
    @Override
    public int getLegalMove(Player playerA)
    {
        int lowestWaitTime = 100;
        Move SmartMove = new Move();
        WaitArea testField = null;
        int cardIndex;

        if(playerA.playerHand.getNumCards() == 0)
        return null;

        for(cardIndex = 0; cardIndex < playerA.playerHand.getNumCards()-1; cardIndex++)
        {
            if (playerA.playerHand.showCard(cardIndex).timeCost() < lowestWaitTime)
            {
                lowestWaitTime = cardIndex;
            }
        }

        testField = SmartMove.move(playerA, cardIndex);

        return SmartMove;
        
    }*/

}
