package strategyassets.Misc;

import junit.framework.TestCase;
public class ExecuteAttackCardMoveTest extends TestCase{
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
}