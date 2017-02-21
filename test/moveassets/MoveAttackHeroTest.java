/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.moveassets;
import cards.Card;
import cards.hearthstone.BloodfenRaptor;
import cards.hearthstone.Romulo;
import hero.Hero;
import hero.hearthstone.Jaina;
import junit.framework.TestCase;
import playerassets.BattleField;

/**
 *
 * @author James
 */
public class MoveAttackHeroTest extends TestCase{

  Hero hero;
  Card card;

  public void testAttackHero(){

    Move attackHero = new MoveAttackHero(card, hero);
    //Hero should start with 20 health points
    assertEquals(20 , hero.getHealthPoints());
    assertEquals(3, card.getAttackPoints());
    //Performe execute to attack the hero
    attackHero.execute();
    //Test that hero lost correct health points
    assertEquals(17 , hero.getHealthPoints());
  }

  @Override
  public void setUp()
  {
      card = new BloodfenRaptor();
      hero = new Jaina();
  }


}
