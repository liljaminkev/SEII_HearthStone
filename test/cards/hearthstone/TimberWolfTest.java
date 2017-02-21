package test.cards.hearthstone;

import cards.hearthstone.TimberWolf;
import junit.framework.TestCase;
public class TimberWolfTest extends TestCase
{
    TimberWolf timberWolf = new TimberWolf();

    public void testAttack()
    {
      assertEquals(1, timberWolf.getAttackPoints());
    }

    public void testDef()
    {
      assertEquals(1, timberWolf.getDefensePoints());
    }

    public void testCost()
    {
        assertEquals(1, timberWolf.getCardCost());
    }

}
