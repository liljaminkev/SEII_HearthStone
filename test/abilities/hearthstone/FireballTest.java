package test.abilities.hearthstone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bashi.aquino
 */

import player.PlayerHero;
import cards.Romulo;
import cards.Fireball;
import cards.TimberWolf;
import cards.DireWolfAlpha;
import junit.framework.TestCase;
public class FireballTest extends TestCase{

    Fireball fireball= new Fireball();

    public void testAttack()
    {
      assertEquals(6, fireball.getAttackPoints());
    }

    public void testDefense()
    {
      assertEquals(0, fireball.getDefensePoints());
    }

    public void testCost()
    {
        assertEquals(4, fireball.getGemCost());
    }

    public void testDamageAttack()
    {
        PlayerHero hero = new PlayerHero();
        assertEquals(30, hero.getHealthPoints());



    }


    public void testAttackPowerBoostTwoCards()
    {
        Romulo romulo = new Romulo();
        TimberWolf timberWolf = new TimberWolf();
        //atk before boost
        assertEquals(1, timberWolf.getAttackPoints());
        assertEquals(4, romulo.getAttackPoints());
        //make new card
        DireWolfAlpha direWolf = new DireWolfAlpha();
        direWolf.performSpecialAbility(timberWolf, romulo);
        //atk after boost
        assertEquals(2, timberWolf.getAttackPoints());
        assertEquals(5, romulo.getAttackPoints());
    }

    public void testAttackPowerBoostOneCard()
    {
        Romulo romulo = new Romulo();
        //atk before boost
        assertEquals(4, romulo.getAttackPoints());
        //make new card
        DireWolfAlpha direWolf = new DireWolfAlpha();
        direWolf.performSpecialAbility(romulo);
        //atk after boost
        assertEquals(5, romulo.getAttackPoints());
    }

    private void assertEquals(int i, int attackPoints) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

}
