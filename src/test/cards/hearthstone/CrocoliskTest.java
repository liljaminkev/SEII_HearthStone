package test.cards.hearthstone;

import cards.hearthstone.Crocolisk;
import cards.Card;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bashi.aquino
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class CrocoliskTest
{
    Card crocolisk = new Crocolisk();

    @Test
    public void testAttack()
    {
      assertEquals(2, crocolisk.getAttackPoints());
    }

    @Test
    public void testDefense()
    {
      assertEquals(3, crocolisk.getDefensePoints());
    }

    @Test
    public void testCost()
    {
        assertEquals(2, crocolisk.getCardCost());
    }

}
