/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.cards.stormwars;

import cards.stormwars;
import cards.Card;
import hero;
import hero.stormwars;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class CardEmberMageTest {
    Card card;
    
    public CardEmberMageTest() {
        assertEquals(card.getCardCost() == 4);
        assertEquals(card.getAttackPoints() == 0);
        assertEquals(card.getDefensePoints() == 4);
        assertEquals(card.getHealthPoint() == 2);
        
        Hero hero = new Laertes();
        assertEquals(hero.getHealthPoints() == 26);
        card.ability(hero, 10);
        assertEquals(hero.getHealthPoints() == 16);
        card.ability(hero, 3);
        assertEquals(hero.getHealthPoints() == 23);
    }
    
    @Before
    public void setUp() {
        card = new CardEmberMage();
    }

    
}
