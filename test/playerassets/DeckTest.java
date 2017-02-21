package test.playerassets;

import playerassets.Deck;
import cards.hearthstone.DireWolfAlpha;
import junit.framework.TestCase;
public class DeckTest extends TestCase
{
  Deck deck;
  DireWolfAlpha dire = new DireWolfAlpha();

  public void testAddingOneCard()
  {
    assertEquals(dire.getAttackPoints(), deck.showCard(0).getAttackPoints());
  }

  @Override
  public void setUp()
  {
      deck = new Deck();
      deck.addCard(dire);
  }

}
