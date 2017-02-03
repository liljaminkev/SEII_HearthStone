

public class Move {

   public void placeCard(Hand playerHand, int handIndex, BattleField battleField, int fieldIndex)
   {
       Card tempCard;
       tempCard = playerHand.showCard(handIndex);
       playerHand.removeFrom(tempCard);
       battleField.addTo(fieldIndex, tempCard);
   }
   
      //attack card takes two players and
   public void attackMinion(int battleFieldIndexA, int battleFieldIndexB, BattleField battleFieldA, BattleField battleFieldB)
   {
       int attackPoints, defensePoints;
       
       defensePoints= battleFieldB.showCard(battleFieldIndexB).getDefensePoints();
       attackPoints= battleFieldA.showCard(battleFieldIndexA).getAttackPoints();
       
       battleFieldB.cards.get(battleFieldIndexB).setDefensePoints(defensePoints-attackPoints);
   }
   
   //attack PlayerHero
   public void attackHero(int battleField, BattleField battlefield, PlayerHero player)
   {       
       player.damageHealth(battlefield.showCard(battleField).getAttackPoints());  
   }

}
