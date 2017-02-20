package moveassets;
import playerassets.*;
public class MoveAttackCard extends Move{

  public MoveAttackCard(int fieldIndexA, int fieldIndexB, BattleField fieldA, BattleField fieldB)
  {
      indexOnField1 = fieldIndexA;
      indexOnField2 = fieldIndexB;
      battleField1 = fieldA;
      battleField2 = fieldB;
  }

}
