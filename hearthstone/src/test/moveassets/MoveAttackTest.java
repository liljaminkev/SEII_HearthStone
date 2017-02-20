package test.moveassets;



import game.Move;
import player.Player;
import player.Hand;
import player.BattleField;
import player.PlayerHero;
import cards.Romulo;
import cards.DireWolfAlpha;
import junit.framework.TestCase;
public class MoveAttackTest extends TestCase
{

    Player playerB;
    BattleField battleFieldplayerA;
    BattleField battleFieldplayerB;
    Hand handplayerA;
    Hand handplayerB;
    DireWolfAlpha dire= new DireWolfAlpha();
    Romulo romulo= new Romulo();

    Move move;

    //test AttackMinion
    public void testAttackMinion()
    {
            assertEquals(1,battleFieldplayerA.getNumCards());
            assertEquals(1,battleFieldplayerB.getNumCards());
            assertEquals(dire.getAttackPoints(),battleFieldplayerA.showCard(0).getAttackPoints());
            assertEquals(romulo.getDefensePoints(),battleFieldplayerB.showCard(0).getDefensePoints());
            move.attackMinion(0, 0, battleFieldplayerA, battleFieldplayerB);
            assertEquals(0,romulo.getDefensePoints());
    }

    //test AttackHero
    public void testAttactHero()
    {
        assertEquals(1,battleFieldplayerA.getNumCards());
        assertEquals(dire.getAttackPoints(),battleFieldplayerA.showCard(0).getAttackPoints());
        assertTrue(playerB.getHero().getHealthPoints()>0);
        move.attackHero(0,battleFieldplayerA, playerB);
        assertTrue(playerB.getHero().getHealthPoints()<30);
    }

    @Override
    public void setUp()
    {
        move = new Move();
        playerB = new PlayerHero();
        battleFieldplayerA= new BattleField();
        battleFieldplayerB= new BattleField();
        handplayerA = new Hand();
        handplayerB = new Hand();
        handplayerA.addTo(handplayerA.getNumCards(), dire);
        handplayerB.addTo(handplayerB.getNumCards(), romulo);
    }

}
