import junit.framework.TestCase;
public class DireWolfAlphaTest extends TestCase
{
    DireWolfAlpha direWolf = new DireWolfAlpha();

    public void testAttack()
    {
      assertEquals(2, direWolf.getAttackPoints());
    }

    public void testDef()
    {
      assertEquals(2, direWolf.getDefensePoints());
    }

    public void testCost()
    {
        assertEquals(2, direWolf.getManaCost());
    }

}
