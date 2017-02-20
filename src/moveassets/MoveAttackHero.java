package moveassets;

import cards.Card;
import hero.Hero;

public class MoveAttackHero extends Move{

  public MoveAttackHero(Card card, Hero hero)
  {
    this.card = card;
    this.heroBeingAttacked = hero;
  }

    /**
     *
     */
  @Override
  public execute()
  {
      hero.setHealthPoints(hero.getHealthPoints() - card.getAttackPoints()); 
  }
}
