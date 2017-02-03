/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

/**
 *
 * @author James
 */
public class HearthDuel extends Duel{

    public HearthDuel(List<Player> _players) {
        super(_players);
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
