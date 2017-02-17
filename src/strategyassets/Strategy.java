package strategyassets;


import player.Player;

//interface that returns a move
public interface Strategy
{
    public int getLegalMove(Player playerA);
}
