/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards.hearthstone;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class BloodfenRaptorTest {
    BloodfenRaptor bRaptor = new BloodfenRaptor();
    
    public BloodfenRaptorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    @Test
    public void testAttack()
    {
      assertEquals(3, bRaptor.getAttackPoints());
    }

    public void testDef()
    {
      assertEquals(2, bRaptor.getDefensePoints());
    }

    public void testCost()
    {
        assertEquals(2, bRaptor.getCardCost());
    }
    
    
    
}
