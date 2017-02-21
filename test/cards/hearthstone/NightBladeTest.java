package test.cards.hearthstone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bashi.aquino
 */
import cards.hearthstone.NightBlade;
import junit.framework.TestCase;
public class NightBladeTest extends TestCase
{
    NightBlade nightblade = new NightBlade();

    public void testAttack()
    {
      assertEquals(4, nightblade.getAttackPoints());
    }

    public void testDefense()
    {
      assertEquals(4, nightblade.getDefensePoints());
    }

    public void testCost()
    {
        assertEquals(5, nightblade.getCardCost());
    }

}
