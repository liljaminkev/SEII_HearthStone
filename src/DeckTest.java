import junit.framework.TestCase;
public class DeckTest extends TestCase
{
  Deck deck;
  DireWolfAlpha dire = new DireWolfAlpha();

  public void testAddingOneCard()
  {
    //assertEquals(dire.getAttackPoints(), deck.showCard(0).getAttackPoints());
  }

  @Override
  public void setUp()
  {
      deck = new Deck();
      deck.addToDeck(dire);
  }

}
