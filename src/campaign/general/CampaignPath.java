/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campaign.general;

import campaign.stormwars.LaertesLevelOne;
import campaign.stormwars.LaertesLevelThree;
import campaign.stormwars.LaertesLevelTwo;
import campaign.stormwars.MyrrhineLevelOne;
import campaign.stormwars.MyrrhineLevelThree;
import campaign.stormwars.MyrrhineLevelTwo;
import gameengine.Duel;
import gameengine.StormDuel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import playerassets.Player;

/**
 *
 * @author rodney
 */
public class CampaignPath implements Serializable{
    private Player player;
    
    public CampaignPath(Player player){
        this.player = player;
    }
    
    // Chooses which path to take for the campaign
    public void choosePath(String path){
        if(path.equalsIgnoreCase("LAERTES")){
            
            // Starts level one
            LaertesLevelOne levelOne = new LaertesLevelOne();
            Player enemy = levelOne.getEnemy();
            
            List<Player> players = new ArrayList<>();
            players.add(player);
            players.add(enemy);
            
            Duel duel = new StormDuel(players);
            duel.play();
            
            // Starts level two
            LaertesLevelTwo levelTwo = new LaertesLevelTwo();
            enemy = levelTwo.getEnemy();
            
            players.remove(enemy);
            players.add(enemy);
            
            duel = new StormDuel(players);
            duel.play();
            
            // Starts level three
            LaertesLevelThree levelThree = new LaertesLevelThree();
            enemy = levelThree.getEnemy();
            
            players.remove(enemy);
            players.add(enemy);
            
            duel = new StormDuel(players);
            duel.play();
        }
        else{
            // Starts level one
            MyrrhineLevelOne levelOne = new MyrrhineLevelOne();
            Player enemy = levelOne.getEnemy();
            
            List<Player> players = new ArrayList<>();
            players.add(player);
            players.add(enemy);
            
            Duel duel = new StormDuel(players);
            duel.play();
            
            // Starts level two
            MyrrhineLevelTwo levelTwo = new MyrrhineLevelTwo();
            enemy = levelTwo.getEnemy();
            
            players.remove(enemy);
            players.add(enemy);
            
            duel = new StormDuel(players);
            duel.play();
            
            // Starts level three
            MyrrhineLevelThree levelThree = new MyrrhineLevelThree();
            enemy = levelThree.getEnemy();
            
            players.remove(enemy);
            players.add(enemy);
            
            duel = new StormDuel(players);
            duel.play();
        }
    }
}
