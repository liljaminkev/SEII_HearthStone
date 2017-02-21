package strategyassets.Misc;

public class ExecuteAttackCardMove implements Command {
  Move atkMove;
  
  public ExecuteAttackCardMove(Move move)
  {
    this.atkMove = move;
  }
  
  public void execute()
  {
    int attackPoints, defensePoints;
    
    defensePoints= atkMove.getBattleField2().showCard(atkMove.getIndexOfField2()).getDefensePoints();
    attackPoints= atkMove.getBattleField1().showCard(atkMove.getIndexOfField1()).getAttackPoints();
    
    atkMove.getBattleField2().showCard(atkMove.getIndexOfField2()).setDefensePoints(defensePoints-attackPoints);
  }
}