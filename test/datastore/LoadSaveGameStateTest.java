/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastore;

import playerassets.*;
import hero.*;
import hero.hearthstone.*;
import hero.stormwars.*;
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
    
    public LoadSaveGameStateTest() {
    }
    
    @Before
    public void setUp() {
        p1 = new PlayerHearthStone();
        p2 = new PlayerStormWars();
        h1 = new Jaina();
        h2 = new Laertes();
    }
    
    
}
