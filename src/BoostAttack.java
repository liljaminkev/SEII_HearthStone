public class BoostAttack implements SpecialMove{
    public void move()
    {

    }
    public void move(Card cardA, int boostAmmount)
    {
        cardA.setAttackPoints(cardA.getAttackPoints() + boostAmmount);
    }

    public void move(Card cardA, Card cardB, int boostAmmount)
    {
        cardA.setAttackPoints(cardA.getAttackPoints() + boostAmmount);
        cardB.setAttackPoints(cardB.getAttackPoints() + boostAmmount);
    }

}
