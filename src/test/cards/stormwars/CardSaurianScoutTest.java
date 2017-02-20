/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.cards.stormwars;
import cards.stormwars.CardSaurianScout;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author James
 */
public class CardSaurianScoutTest {
    CardSaurianScout scout;
    public CardSaurianScoutTest() {
        //Test the attack power
        assertEquals(1, scout.getAttackPoints());
        //Test the defense
        assertEquals(6, scout.getDefensePoints());
        //Test the cost
        assertEquals(4, scout.getCardCost());

    }

    @Before
    public void setUp() {
        scout = new CardSaurianScout();
    }

}
