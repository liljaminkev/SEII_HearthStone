package test.gameassets;

import junit.framework.TestCase;
public class ExecutePlaceMoveTest extends TestCase{
  BattleField field1;
  Hand hand;
  BloodfenRaptor bloodfenRaptor;
  
  public void testPlace(){
    MovePlaceCard movecard = new MovePlaceCard(hand, hand.showCard(0), 0, field1);
    ExecutePlaceMove executeMove = new ExecutePlaceMove(movecard);
    
    
    executeMove.execute();
    assertEquals(2, movecard.getBattleField1().showCard(0).getDefensePoints());
  }
  
  public void setUp()
  {
      field1 = new BattleField();
      bloodfenRaptor = new BloodfenRaptor();
      hand = new Hand();
      hand.addCard(bloodfenRaptor);
  }
}