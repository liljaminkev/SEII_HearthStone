package test.gameassets;

import junit.framework.TestCase;
public class ExecuteAttackPlayerTest extends TestCase{
  
  Player player;
  Hand hand;
  Deck deck;
  PlayerHero hero = new PlayerHero(15, 0);
  Romulo romulo;
  
  public void attackPlayer()
  {
    MoveAttackPlayer atk = new MoveAttackPlayer(romulo, player);
    ExecuteAttackPlayer executeAtk = new ExecuteAttackPlayer(atk);
    executeAtk.execute();
    assertEquals(11, atk.getPlayer().getHero().getHealthPoints());
  }
  
  
  public void setUp()
  {
      deck = new Deck();
      hand = new Hand();
      romulo = new Romulo();
      player = new Player(hero, deck, hand);
  }
}