/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine;

import java.util.ArrayList;
import java.util.List;
import playerassets.Player;

/**
 *
 * @author rodney
 */
public class DuelFactory {
    private List<Player> players = new ArrayList<>();
    
    public Duel getDuel(String duel){
        if(duel.equalsIgnoreCase("HEARTHSTONE")){
            return new HearthDuel(players);
        }
        else if(duel.equalsIgnoreCase("STORMWARS")){
            return new StormDuel(players);
        }
        else{
            return null;
        }
    }
    
    
}
