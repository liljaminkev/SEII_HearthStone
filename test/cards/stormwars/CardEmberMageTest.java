/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards.stormwars;

import cards.stormwars.CardEmberMage;
import cards.Card;
import hero.Hero;
import hero.stormwars.HeroLaertes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author James
 */
public class CardEmberMageTest {
    CardEmberMage card = new CardEmberMage();
    
    public CardEmberMageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testCardEmberMage() {
        assertEquals(card.getCardCost(), 2);
        assertEquals(card.getAttackPoints(), 4);
        assertEquals(card.getDefensePoints(), 4);

        
        Hero hero = new HeroLaertes();
        assertEquals(hero.getHealthPoints(), 26);
        card.ability(hero, 10);
        assertEquals(hero.getHealthPoints(), 16);
        card.ability(hero, 3);
        assertEquals(hero.getHealthPoints(), 13);
    }
  
        
  
    
}
