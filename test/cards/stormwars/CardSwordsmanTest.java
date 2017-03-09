//tests elite card
package cards.stormwars;

import static org.junit.Assert.*; 

public class CardSwordsmanTest //extends TestCase
{
    CardSwordsman swordsmanCard = new CardSwordsman();

    public void testAttack()
    {
      assertEquals(2, swordsmanCard.getAttackPoints());
    }

    public void testHP()
    {
      assertEquals(5, swordsmanCard.getDefensePoints());
    }

    public void testTimeCost()
    {
        assertEquals(5, swordsmanCard.getCardCost());
    }

}
