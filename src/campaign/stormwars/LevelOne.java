/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campaign.stormwars;
import hero.stormwars.HeroLaertes;
import java.io.Serializable;
import playerassets.Deck;
import playerassets.Hand;
import playerassets.Player;
import playerassets.PlayerStormWars;

/**
 *
 * @author rodney
 */
public class LevelOne implements Serializable{

    private Player enemy;
    
    public LevelOne(){
        enemy = new PlayerStormWars(new HeroLaertes(), new Deck(), new Hand());
    }
    
    // Method that returns the enemy of level one
    public Player getEnemy(){
        return enemy;
    }
}
