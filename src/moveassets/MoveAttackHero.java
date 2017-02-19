public class MoveAttackHero extends Move{

  public MoveAttackHero(Card card, Hero hero)
  {
    this.card = card;
    this.heroBeingAttacked = hero;
  }

  public execute()
  {
      hero.setHealthPoints(hero.getHealthPoints() - card.getAttackPoints()); 
  }
}
