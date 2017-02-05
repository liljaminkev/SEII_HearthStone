package cards_test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bashi.aquino
 */
import junit.framework.TestCase;
public class Crocolisk extends TestCase
{
    Crocolisk crocolisk = new Crocolisk();

    public void testAttack()
    {
      assertEquals(2, crocolisk.getAttackPoints());
    }

    public void testDefense()
    {
      assertEquals(3, crocolisk.getDefensePoints());
    }

    public void testCost()
    {
        assertEquals(2, crocolisk.getManaCost());
    }

}

