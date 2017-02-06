package abilities;


import cards.Card;
import player.Player;

// ability is used to book attack power of cards next to it
public class BoostAttack implements SpecialAbility{
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
    public void ability(Card a, Player playerA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
