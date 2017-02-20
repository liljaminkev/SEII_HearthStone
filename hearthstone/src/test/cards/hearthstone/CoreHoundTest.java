package test.cards.hearthstone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cards.hearthstone.CoreHound;
import cards.Card;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodney
 */
public class CoreHoundTest {

    private final Card coreHound;

    public CoreHoundTest() {
        coreHound = new CoreHound();
    }

    //Testing methods
    @Test
    public void testAttackPoints(){
        assertEquals(9, coreHound.getAttackPoints());
    }

    @Test
    public void testDefensePoints(){
        assertEquals(5, coreHound.getDefensePoints());
    }

    @Test
    public void testGemCost(){
        assertEquals(7, coreHound.getCardCost());
    }
}
