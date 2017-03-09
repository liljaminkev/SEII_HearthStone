/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastore;

import datastore.*;
import playerassets.*;
import hero.*;
import hero.hearthstone.*;
import hero.stormwars.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class LoadSaveGameStateTest {
    Player p1, p2;
    Hero h1, h2;
    Deck d1, d2;
    Hand ha1, ha2;
    ArrayList<Player> fromFile = null;

    
    public LoadSaveGameStateTest() {
        SaveGameState.saveFile(p1, p2, "testSaveFile.txt");
        fromFile = new AraryList<Player>();
        fromFile = LoadGameState.loadGame("testSaveFile.txt");
        
        assertEquals("Jaina" == fromFile.get(0).getName());
        assertEquals("Laertes" == fromFile.get(1).getName());
        
        
    }
    
    @Before
    public void setUp() {
        p1 = new PlayerHearthStone();
        p2 = new PlayerStormWars();
        h1 = new Jaina();
        h2 = new Laertes();
        d1 = new Deck();
        d2 = new Deck();
        ha1 = new Hand();
        ha2 = new Hand();
        
    }
    
    
}
