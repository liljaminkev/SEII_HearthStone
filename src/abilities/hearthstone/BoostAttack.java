package abilities.hearthstone;


import cards.Card;
import player.Player;

// ability is used to book attack power of cards next to it
public class BoostAttack implements SpecialAbility{
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
    public void ability(Card a, Player playerA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
