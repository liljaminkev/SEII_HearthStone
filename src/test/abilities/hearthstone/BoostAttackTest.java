package test.abilities.hearthstone;

import junit.framework.TestCase;
public class BoostAttackTest extends TestCase
{
    //test for two minions on table
    Romulo romulo = new Romulo();
    TimberWolf timberWolf = new TimberWolf();

    public void testAttackPowerBoostOneCard()
    {
        //atk before boost
        assertEquals(4, romulo.getAttackPoints());
        //make new card
        DireWolfAlpha direWolf = new DireWolfAlpha();
        direWolf.performSpecialAbility(romulo);
        //atk after boost
        //assertEquals(2, timberWolf.getAttackPoints());
        assertEquals(5, romulo.getAttackPoints());
    }

    public void testAttackPowerBoostTwoCard()
    {
        //atk before boost
        assertEquals(4, romulo.getAttackPoints());
        assertEquals(1, timberWolf.getAttackPoints());
        //make new card
        DireWolfAlpha direWolf = new DireWolfAlpha();
        direWolf.performSpecialAbility(romulo, timberWolf);
        //atk after boost
        assertEquals(5, romulo.getAttackPoints());
        assertEquals(2, timberWolf.getAttackPoints());
    }


    public void setUp()
    {
        Romulo romulo = new Romulo();
        TimberWolf timberWolf = new TimberWolf();
    }

}
