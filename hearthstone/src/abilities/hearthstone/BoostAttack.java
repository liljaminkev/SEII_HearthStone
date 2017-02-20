package abilities.hearthstone;
import cards.Card;
import playerassets.Player;
import cards.abilities.SpecialAbility;


// ability is used to book attack power of cards next to it
public class BoostAttack implements SpecialAbility{
    public void ability()
    {

    }

    public void ability(Card cardA, int boostAmmount)
    {
        cardA.setAttackPoints(cardA.getAttackPoints() + boostAmmount);
    }

    public void ability(Card cardA, Card cardB, int boostAmmount)
    {
        cardA.setAttackPoints(cardA.getAttackPoints() + boostAmmount);
        cardB.setAttackPoints(cardB.getAttackPoints() + boostAmmount);
    }

    public void ability(Card a, Player playerA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
