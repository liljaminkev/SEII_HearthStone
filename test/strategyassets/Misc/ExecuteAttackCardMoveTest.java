/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyassets.Misc;

import cards.hearthstone.BloodfenRaptor;
import cards.hearthstone.Romulo;
import moveassets.MoveAttackCard;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import playerassets.BattleField;

/**
 *
 * @author James
 */
public class ExecuteAttackCardMoveTest {
    
    BattleField field1;
  BattleField field2;
  BloodfenRaptor bloodfenRaptor;
  Romulo romulo;
  
  public void testAttack(){
    MoveAttackCard movecard = new MoveAttackCard(0, 0, field1, field2);
    ExecuteAttackCardMove executeMove = new ExecuteAttackCardMove(movecard);
    executeMove.execute();
    assertEquals(-2, movecard.getBattleField2().showCard(0).getDefensePoints());
  }
  
  public void setUp()
  {
      field1 = new BattleField();
      field2 = new BattleField();
      bloodfenRaptor = new BloodfenRaptor();
      romulo = new Romulo();
      field1.addCard(0,romulo);
      field2.addCard(0,bloodfenRaptor);
  }

    /**
     * Test of execute method, of class ExecuteAttackCardMove.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        ExecuteAttackCardMove instance = null;
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
