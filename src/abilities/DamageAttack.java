/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bashi.aquino
 */
package abilities;

//ability is used to damage the hero

import player.Player;
import cards.Card;

public class DamageAttack implements SpecialAbility {
    
    @Override
    public void ability()
    {

    }
    @Override
    public void ability(Card cardA, int boostAmount)
    {
        cardA.setAttackPoints(cardA.getAttackPoints() + boostAmount);
    }

    @Override
    public void ability(Card cardA, Card cardB, int boostAmount)
    {
        cardA.setAttackPoints(cardA.getAttackPoints() + boostAmount);
        cardB.setAttackPoints(cardB.getAttackPoints() + boostAmount);
    }

    @Override
     public void ability (Card a, Player playerA)
     {
         playerA.getHero().damageHealth(a.getAttackPoints());
     }
     
  

}
