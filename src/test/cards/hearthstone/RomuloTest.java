package test.cards.hearthstone;

import cards.hearthstone.Romulo;
import junit.framework.TestCase;
public class RomuloTest extends TestCase
{
    Romulo romulo = new Romulo();

    public void testAttack()
    {
      assertEquals(4, romulo.getAttackPoints());
    }

    public void testDef()
    {
      assertEquals(2, romulo.getDefensePoints());
    }

    public void testCost()
    {
        assertEquals(4, romulo.getCardCost());
    }

}
