/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormwars;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;

/**
 *
 * @author bashi.aquino
 */
public class SmartPlaceTest {
    
   
    Player player;
    Hand hand;
    Deck deck;
    Hero hero= new Hero(20) {};
    
    public void testPlaceWithCardInHand()
    {
        assertEquals( 1, player.getDeck().getNumCards());
        assertEquals( 2, player.getHand().getNumCards());
    }
    
    public void testDeckFull(){
        Move smartPlace = new MovePlaceCard();
        Card card=hand.showCard(1);
        
        for(int counter=0; counter <= 7; counter++)
        {
        smartPlace.placeCard(hand,card,counter,player.getBattleField());
        }
        assertEquals(7,deck.getNumCards());
        
    }
    
    public SmartPlaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        deck = new Deck();
        hand = new Hand();
        CardDreamDust dreamdust = new CardDreamDust();
        CardProdromoi prodromoi = new CardProdromoi();
        deck.addCard(dreamdust);
        hand.addCard(dreamdust);
        hand.addCard(prodromoi);
        player = new Player(hero, deck, hand){};   
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLegalMove method, of class SmartPlace.
     */
    @Test
    public void testGetLegalMove() {
        System.out.println("getLegalMove");
        Player playerA = null;
        SmartPlace instance = new SmartPlace();
        int expResult = 0;
        Move result = instance.getLegalMove(playerA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
