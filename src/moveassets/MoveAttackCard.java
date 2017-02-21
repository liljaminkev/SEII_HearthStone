//this move represents an attack form field a to field b
package moveassets;
import playerassets.*;
import playerassets.Cards;
import cards.Card;
public class MoveAttackCard extends Move{

  public MoveAttackCard(int fieldIndexA, int fieldIndexB, BattleField fieldA, BattleField fieldB)
  {
      indexOnField1 = fieldIndexA;
      indexOnField2 = fieldIndexB;
      battleField1 = fieldA;
      battleField2 = fieldB;
  }

  //attack from field 1 to field 2
  public void execute()
  {
      battleField2.showCard(indexOnField2).setDefensePoints(battleField2.showCard(indexOnField2).getDefensePoints() -
      battleField1.showCard(indexOnField1).getAttackPoints());
  }

}
