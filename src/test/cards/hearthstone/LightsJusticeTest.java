package test.cards.hearthstone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cards.hearthstone.LightsJustice;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class LightsJusticeTest {

    LightsJustice lJustice = new LightsJustice();

    public void testAttack()
    {
      assertEquals(1, lJustice.getAttackPoints());
    }

    public void testDef()
    {
      assertEquals(4, lJustice.getDefensePoints());
    }

    public void testCost()
    {
        assertEquals(1, lJustice.getCardCost());
    }

}
