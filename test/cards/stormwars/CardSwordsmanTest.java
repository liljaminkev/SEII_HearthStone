//tests elite card
package test.cards.stormwars;
import card.CardSwordsman;
import junit.framework.TestCase;
public class CardSwordsmanTest extends TestCase
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
        assertEquals(5, swordsmanCard.getTimeCost());
    }

}
