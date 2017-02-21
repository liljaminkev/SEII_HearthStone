package cards.hearthstone.abilities;

//ability is used to damage the hero

import playerassets.Player;
import cards.Card;
import cards.SpecialAbility;

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
         //playerA.getHero().damageHealth(a.getAttackPoints());
     }

    @Override
    public String getAbilityName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAbilityName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
