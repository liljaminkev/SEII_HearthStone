package strategyassets;

import moveassets.Move;
import playerassets.Player;

//smart move to return offensive moves
public class SmartMove extends Strategy
{
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
        @Override
        public Move getLegalMove(Player playerA, Player playerB) {
            return super.getLegalMove(playerA, playerB); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String toString() {
            return super.toString(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int hashCode() {
            return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
        }
}
