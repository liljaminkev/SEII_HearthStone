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
  int cardIndexA;
  int cardIndexB;
  int battleFieldIndexA;
  int battleFieldIndexB;
  Player playerA;
  Player playerB;
  
   public void placeCard(int cardIndex, int battleFieldIndex)
   {
       cardIndexA = cardIndex;
       battleFieldIndexA = battleFieldIndex;
   }
   
   //attack card takes two players and 
   public void attackCard(int battleFieldIndexA, int battleFieldIndexB)
   {
     this.battleFieldIndexA = battleFieldIndexA;
     this.battleFieldIndexB = battleFieldIndexB;
   }
   
   public int getIndexA()
   {
     return cardIndexA;
   }
   public int getIndexB()
   {
     return cardIndexB;
   }
   public int getBattleFieldIndexA()
   {
     return battleFieldIndexA;
   }
   public int getBattleFieldIndexB()
   {
     return battleFieldIndexB;
   }
   
   
   
}
