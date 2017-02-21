package cards.hearthstone;
import cards.hearthstone.abilities.DamageAttack;
import cards.Card;

//Fireball will deal 6 damage to the PlayerHero
public class Fireball extends Card {

    public Fireball()
    {
        super("Fireball", 6, 0, 4);
        specialAbility = new DamageAttack();
    }
}
