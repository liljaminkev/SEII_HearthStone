//used to test card
package test.cards.stormwars;
import card.CardProdromoi;
import junit.framework.TestCase;
public class CardProdromoiTest extends TestCase
{
    CardProdromoi prodromoi = new CardProdromoi();

    public void testAttack()
    {
      assertEquals(1, prodromoi.getAttackPoints());
    }

    public void testHP()
    {
      assertEquals(3, prodromoi.getDefensePoints());
    }

    public void testTimeCost()
    {
        assertEquals(1, prodromoi.getTimeCost());
    }

}
