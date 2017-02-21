//Strategy is an interface to get legal moves when placing, or attacking the enemy player
package strategyassets;

import playerassets.Player;
import moveassets.Move;
//interface that returns a move
public abstract class Strategy
{

    public Move getLegalMove(Player playerA){return null;}
    public Move getLegalMove(Player playerA, Player playerB){return null;}

}
