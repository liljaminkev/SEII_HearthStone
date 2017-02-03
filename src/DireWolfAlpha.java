//direwolf will boost the attack power of adjacent cards
public class DireWolfAlpha extends Card
{
    public DireWolfAlpha()
    {
        super(2, 2, 2, 1);
        specialAbility = new BoostAttack();
    }
}
