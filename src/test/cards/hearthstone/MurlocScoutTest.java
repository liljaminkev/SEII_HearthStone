package test.cards.hearthstone;

import cards.hearthstone.MurlocScout;
import cards.Card;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodney
 */
public class MurlocScoutTest {

    private final Card murlocScout;

    public MurlocScoutTest() {
        murlocScout = new MurlocScout();
    }

    //Testing methods
    @Test
    public void testDefensePoints(){
        assertEquals(1, murlocScout.getDefensePoints());
    }

    @Test
    public void testAttackPoints(){
        assertEquals(1, murlocScout.getAttackPoints());
    }

    @Test
    public void testGemCost(){
        assertEquals(0, murlocScout.getCardCost());
    }
}
