package test.cards.hearthstone;

import junit.framework.TestCase;
public class DireWolfAlphaTest extends TestCase
{
    DireWolfAlpha direWolf1 = new DireWolfAlpha();

    public void testAttack()
    {
      assertEquals(2, direWolf1.getAttackPoints());
    }

    public void testDef()
    {
      assertEquals(2, direWolf1.getDefensePoints());
    }

    public void testCost()
    {
        assertEquals(2, direWolf1.getCardCost());
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

}
