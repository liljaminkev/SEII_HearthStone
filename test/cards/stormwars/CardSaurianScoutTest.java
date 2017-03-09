/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards.stormwars;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class CardSaurianScoutTest {
    CardSaurianScout scout = new CardSaurianScout();
    public CardSaurianScoutTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testCard() {
           //Test the attack power
        assertEquals(1, scout.getAttackPoints());
        //Test the defense
        assertEquals(6, scout.getDefensePoints());
        //Test the cost
        assertEquals(4, scout.getCardCost());
    }
    
}
