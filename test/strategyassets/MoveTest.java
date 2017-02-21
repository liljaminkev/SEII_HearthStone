package test.strategyassets;

import game.Move;
import player.Hand;
import player.BattleField;
import cards.Romulo;
import cards.DireWolfAlpha;
import junit.framework.TestCase;
public class MoveTest extends TestCase
{
    BattleField battleField;
    Hand hand;
    DireWolfAlpha dire = new DireWolfAlpha();
    Romulo romulo = new Romulo();

    Move move;

    public void testHandToBattleField()
    {
        assertEquals(0, battleField.getNumCards());
        assertEquals(3, hand.getNumCards());
        move.placeCard(hand, 0, battleField, 0);
        assertEquals(dire.getAttackPoints(), battleField.showCard(0).getAttackPoints());
        assertEquals(1, battleField.getNumCards());
        assertEquals(2, hand.getNumCards());
    }
    public void testHandToBattleFieldManyCards()
    {
        move.placeCard(hand, 0, battleField, 0);
        move.placeCard(hand, 0, battleField, 0);
        assertEquals(romulo.getAttackPoints(), battleField.showCard(0).getAttackPoints());
        assertEquals(dire.getAttackPoints(), battleField.showCard(1).getAttackPoints());
        assertEquals(1, hand.getNumCards());
        assertEquals(2, battleField.getNumCards());
    }

    @Override
    public void setUp()
    {
        move = new Move();
        battleField = new BattleField();
        hand = new Hand();
        hand.addCard(hand.getNumCards(), dire);
        hand.addCard(hand.getNumCards(), romulo);
        hand.addCard(hand.getNumCards(), dire);
    }

}
