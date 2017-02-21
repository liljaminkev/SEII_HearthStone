package strategyassets.Misc;

import moveassets.Move;
import strategyassets.Command;

public class ExecuteAttackPlayer implements Command {
  Move atkMove;
  
  public ExecuteAttackPlayer(Move move)
  {
    this.atkMove = move;
  }
  
  public void execute()
  {
    int hp;
    hp = atkMove.getPlayer().getHero().getHealthPoints() - atkMove.getCardToBeUsed().getAttackPoints();
    atkMove.getPlayer().getHero().damageHealth(hp);
  }
}