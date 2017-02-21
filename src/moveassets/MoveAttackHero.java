package moveassets;
import hero.Hero;
import cards.Card;
public class MoveAttackHero extends Move{

  public MoveAttackHero(Card card, Hero hero)
  {
    this.card = card;
    this.heroBeingAttacked = hero;
  }

  public void execute()
  {
      heroBeingAttacked.setHealthPoints(heroBeingAttacked.getHealthPoints() - card.getAttackPoints());
  }
}
