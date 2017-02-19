/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine;

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
    if(players[0].getHero().getHealthPoints() == 0){
        return players[1];
    }
    else if (players[0].getHero().getHealthPoints() == 0){
        return players[0];
    }
    else return ;
    }

}
