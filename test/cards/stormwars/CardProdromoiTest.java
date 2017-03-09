//used to test card
package cards.stormwars;

import static org.junit.Assert.*;
public class CardProdromoiTest //extends TestCase
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
        assertEquals(1, prodromoi.getCardCost());
    }

}
