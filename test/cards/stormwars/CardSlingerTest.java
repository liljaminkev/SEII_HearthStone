/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards.stormwars;

import cards.Card;
import cards.stormwars.CardSlinger;
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
public class CardSlingerTest {
    CardSlinger slinger;
    public CardSlingerTest() {
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
