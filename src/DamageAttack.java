/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bashi.aquino
 */
package temp;

//ability is used to damage the hero
public class DamageAttack implements SpecialAbility {
    
    @Override
    public void ability()
    {

    }
    @Override
    public void ability(Card cardA, int boostAmmount)
    {
        cardA.setAttackPoints(cardA.getAttackPoints() + boostAmmount);
    }

    @Override
    public void ability(Card cardA, Card cardB, int boostAmmount)
    {
        cardA.setAttackPoints(cardA.getAttackPoints() + boostAmmount);
        cardB.setAttackPoints(cardB.getAttackPoints() + boostAmmount);
    }

    @Override
     public void ability (Card a, Player playerA)
     {
         playerA.getHero().damageHealth(a.getAttackPoints());
     }
     
  

}
