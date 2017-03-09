//used to test card
package cards.stormwars;

import static org.junit.Assert.*;
import org.junit.Test;
public class CardProdromoiTest //extends TestCase
{
    CardProdromoi prodromoi = new CardProdromoi();

    @Test
    public void testAttack()
    {
      assertEquals(1, prodromoi.getAttackPoints());
    }
    @Test
    public void testHP()
    {
      assertEquals(3, prodromoi.getDefensePoints());
    }
    @Test
    public void testTimeCost()
    {
        assertEquals(1, prodromoi.getCardCost());
    }

}
