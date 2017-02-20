package cards.hearthstone;
import cards.Card;
import cards.SpecialAbility;
import cards.hearthstone.abilities.BoostAttack;
//direwolf will boost the attack power of adjacent cards
public class DireWolfAlpha extends Card
{
    public DireWolfAlpha()
    {
        super("Dire Wolf Alpha", 2, 2, 2);
        this.setSpecialAbilityAmmount(1);
        this.setSpecialAbility(new BoostAttack());
    }
}
