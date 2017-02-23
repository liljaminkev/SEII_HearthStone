/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine;

import java.util.List;
import playerassets.Player;

/**
 *
 * @author rodney
 */
public class StormDuel extends Duel{
    
    public StormDuel(List<Player> players){
        super(players);
    }

    @Override
    protected Player findWinner() {
        if(players.get(0).getHero().getHealthPoints() <= 0){
            return players.get(1);
        }
        else if(players.get(1).getHero().getHealthPoints() <= 0){
            return players.get(0);
        }
        else{
            return null;
        }
    }
    
}
