//tests elite card
package cards.stormwars;

import static org.junit.Assert.*; 
import org.junit.Test;
public class CardSwordsmanTest //extends TestCase
{
    CardSwordsman swordsmanCard = new CardSwordsman();
    
    @Test
    public void testAttack()
    {
      assertEquals(2, swordsmanCard.getAttackPoints());
    }

    @Test
    public void testHP()
    {
      assertEquals(5, swordsmanCard.getDefensePoints());
    }

    @Test
    public void testTimeCost()
    {
        assertEquals(5, swordsmanCard.getCardCost());
    }

}
