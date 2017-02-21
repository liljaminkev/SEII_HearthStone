package test.moveassets;
import moveassets.MoveAttackCard;
import junit.framework.TestCase;
public class MoveAttackCardTest extends TestCase{
  BattleField field1;
  BattleField field2;
  BloodfenRaptor bloodfenRaptor;
  Romulo romulo;

  public void testAttack(){
    MoveAttackCard movecard = new MoveAttackCard(0, 0, field1, field2);
    assertEquals(0, movecard.getIndexOfField1());
    assertEquals(0, movecard.getIndexOfField2());
    assertEquals("Romulo", movecard.getBattleField1().showCard(0).getCardName());
    assertEquals("Bloodfen Raptor", movecard.getBattleField2().showCard(0).getCardName());
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
