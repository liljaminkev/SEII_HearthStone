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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
    List<Player> fromFile;

    
    public LoadSaveGameStateTest() throws IOException, FileNotFoundException, ClassNotFoundException {
        this.fromFile = null;
        SaveGameState.saveFile(p1, p2, "testSaveFile.txt");
        fromFile = new ArrayList<>();
        fromFile = LoadGameState.loadGame("testSaveFile.txt");
        
        assert("Jaina".equals(fromFile.get(0).getHero().getName()));
        assert("Laertes".equals(fromFile.get(1).getHero().getName()));
        
        
    }
    
    @Before
    public void setUp() {
        h1 = new Jaina();
        h2 = new HeroLaertes();
        d1 = new Deck();
        d2 = new Deck();
        ha1 = new Hand();
        ha2 = new Hand();
        p1 = new PlayerHearthStone(h1, d1, ha1);
        p2 = new PlayerStormWars(h2, d2, ha2);
        
    }
    
    
}
