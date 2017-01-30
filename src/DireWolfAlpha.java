public class DireWolfAlpha extends Card
{
    public DireWolfAlpha()
    {
        super(2, 2, 2);
    }
    public DireWolfAlpha(Card cardA, Card cardB)
    {
        super(2, 2, 2);
        cardA.setAttackPoints(cardA.getAttackPoints() + 1);
        cardB.setAttackPoints(cardB.getAttackPoints() + 1) ;
    }
    public DireWolfAlpha(Card cardA)
    {
        super(2, 2, 2);
        cardA.setAttackPoints(cardA.getAttackPoints() + 1) ;
    }
}
