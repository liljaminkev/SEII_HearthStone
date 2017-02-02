import junit.framework.TestCase;
public class DeckTest extends TestCase
{
  private Deck deck;
  DireWolfAlpha dire;
  
  public void testAddingOneCard()
  {
    dire = new DireWolfAlpha();
    deck.addToDeck(dire);
    assertEquals(dire.getAttackPoints(), deck.showCard(0).getAttackPoints());
  }
  
  public void setUP()
  {
    deck = new Deck();
  }
  
}