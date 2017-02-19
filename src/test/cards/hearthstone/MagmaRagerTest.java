package test.cards.hearthstone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cards.hearthstone.MagmaRager;
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
public class MagmaRagerTest {

    private final Card magmaRager;

    public MagmaRagerTest() {
        magmaRager = new MagmaRager();
    }

    //Testing methods
    @Test
    public void testDefensePoints(){
        assertEquals(1, magmaRager.getDefensePoints());
    }

    @Test
    public void testAttackPoints(){
        assertEquals(5, magmaRager.getAttackPoints());
    }

    @Test
    public void testGemCost(){
        assertEquals(3, magmaRager.getCardCost());
    }
}
