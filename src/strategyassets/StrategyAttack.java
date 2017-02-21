//the attack Strategy will attack the oppising player using highest attack card
// if opposing player has no cards on the field
package strategyassets;
import playerassets.Player;
import playerassets.BattleField;
import cards.Card;
import moveassets.*;
public class StrategyAttack extends Strategy
{
    public Move getLegalMove(Player playerA, Player playerB)
    {
        int highestAttackPower = -1;
        Move move = null;
        Card cardTobeUsed = null;
        BattleField battleField = playerA.getBattleField();
        BattleField battleField2 = playerB.getBattleField();


        //if playerB has no cards and we have cards attack player
        if(playerB.getBattleField().getNumCards() == 0 && playerA.getBattleField().getNumCards() > 0){

            for(int cardIndex = 0; cardIndex < battleField.getNumCards(); cardIndex++)
            {
                if(highestAttackPower > battleField.showCard(cardIndex).getAttackPoints() &&
                battleField.showCard(cardIndex).getCardTurn() != 0){
                    highestAttackPower = battleField.showCard(cardIndex).getAttackPoints();
                    cardTobeUsed = battleField.showCard(cardIndex);
                }
            }
            move = new MoveAttackHero(cardTobeUsed, playerB.getHero());
            return move;
        }
        //if playerB has cards attack a playerb card
        else if(playerB.getBattleField().getNumCards() > 0 && playerA.getBattleField().getNumCards() > 0){
            int indexPlayerA = 0;
            int indexPlayerB = 0;
            int highestHealth = 0;

            //find a card that can attack with highest atkpower
            for(int index = 0; index < battleField.getNumCards(); index++)
            {
                if(highestAttackPower > battleField.showCard(index).getAttackPoints() &&
                battleField.showCard(index).getCardTurn() != 0){
                    highestAttackPower = battleField.showCard(index).getAttackPoints();
                    indexPlayerA = index;
                }
            }

            //find card with highest HP to attack
            for(int index = 0; index < battleField2.getNumCards(); index++)
            {
                if(highestHealth > battleField2.showCard(index).getDefensePoints()){
                    highestHealth = battleField2.showCard(index).getDefensePoints();
                    indexPlayerB = index;
                }
            }


            move = new MoveAttackCard(indexPlayerA, indexPlayerB, playerA.getBattleField(), playerB.getBattleField());
            return move;
        }
        //else cannot do anything
        else{
            return move;
        }

    }
}
