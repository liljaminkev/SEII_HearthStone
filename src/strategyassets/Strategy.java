package strategyassets;


import player.Player;

//interface that returns a move
public abstract class Strategy
{
    public Move getLegalMove(Player playerA);
}
