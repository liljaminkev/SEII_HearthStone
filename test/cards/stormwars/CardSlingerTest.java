/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards.stormwars;

import cards.stormwars.CardSlinger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class CardSlingerTest {
    CardSlinger slinger;
    
    @Test
    public void testCardSlinger() {
        //Test the attack power
        assertEquals(1, slinger.getAttackPoints());
        //Test the defense
        assertEquals(5, slinger.getDefensePoints());
        //Test the cost
        assertEquals(2, slinger.getCardCost());
        
    }
    
    @Before
    public void setUp() {
        slinger = new CardSlinger();
    }
    
}
