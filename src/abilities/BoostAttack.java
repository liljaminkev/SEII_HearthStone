package abilities;


import cards.Card;

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

}
