package cards.hearthstone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class BluegillWarriorTest {
    BluegillWarrior bgWarrior = new BluegillWarrior();
    
    @Test
    public void testAttack()
    {
      assertEquals(2, bgWarrior.getAttackPoints());
    }

    public void testDef()
    {
      assertEquals(1, bgWarrior.getDefensePoints());
    }

    public void testCost()
    {
        assertEquals(2, bgWarrior.getCardCost());
    }
}
