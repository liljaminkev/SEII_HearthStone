package moveassets;

import playerassets.BattleField;

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
      battleField2.showcard(indexOnField2).setdefence  battleField1.showcard
  }

}
