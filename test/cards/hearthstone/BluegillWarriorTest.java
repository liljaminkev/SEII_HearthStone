package test.cards.hearthstone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cards.BluegillWarrior;
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
public class BluegillWarriorTest {
    BluegillWarrior bgWarrior = new BluegillWarrior();

    public void testAttack()
    {
      assertEquals(1, bgWarrior.getAttackPoints());
    }

    public void testDef()
    {
      assertEquals(1, bgWarrior.getDefensePoints());
    }

    public void testCost()
    {
        assertEquals(2, bgWarrior.getCardCost());
    }
}
