package cards.hearthstone.abilities;

//ability is used to damage the hero

import player.Player;
import cards.Card;

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
