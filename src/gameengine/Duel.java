package gameengine;

import playerassets.Player;
import java.util.List;

/**
 * Defines main loop of a card duel game.
 * Extend this class for a particular game
 * @author David
 *
 */
public abstract class Duel {
    public final List<Player> players;

    public Duel(List<Player> _players) {
        players = _players;
    }

    /**
     * General method to play the game until there is a winner
     * @return winning player
     */
    public Player play() {
        Player winner;
        while (null == (winner = findWinner())) {
            for (Player player : players) {
                beforeTurn();
                // Give a Move a reference to game information
                // so it can access the necessary functionality
                player.pickMove().execute(this);
                afterTurn();
            }
        }
        return winner;
    }

    /**
     * Check for a winner
     * @return winning Player if game is over, null if not
     */
    protected abstract Player findWinner();
    /**
     * Run this code at the start of a player's turn
     */
    protected void beforeTurn() {

    }

    /**
     * Run this code at the end of a player's turn
     */
    protected void afterTurn() {
    }

}
