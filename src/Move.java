/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodney
 */
public class Move {

   public void placeCard(Hand playerHand, int handIndex, BattleField battleField, int fieldIndex)
   {
       Card tempCard;
       tempCard = playerHand.showCard(handIndex);
       playerHand.removeCard(tempCard);
       battleField.addCard(fieldIndex, tempCard);
   }

/*
   //attack card takes two players and
   public void attackCard(int battleFieldIndexA, int battleFieldIndexB)
   {
     this.battleFieldIndexA = battleFieldIndexA;
     this.battleFieldIndexB = battleFieldIndexB;
   }

   public int getIndexA()
   {
     return cardIndexOfHandA;
   }
   public int getIndexB()
   {
     return cardHandOfIndexB;
   }
   public int getBattleFieldIndexA()
   {
     return battleFieldIndexA;
   }
   public int getBattleFieldIndexB()
   {
     return battleFieldIndexB;
   }
*/
}
