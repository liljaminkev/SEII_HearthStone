/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import playerassets.Player;

/**
 *
 * @author James
 * The LoadGameState class will build the player objects from a text file
 */
public class LoadGameState {
    
    /**
     *
     * @param fileName
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     * Loads from a specified save file
     */
    public static ArrayList<Player> loadGame(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Player> players = null;
        
        try (FileInputStream fin = new FileInputStream(fileName); 
                ObjectInputStream ois = new ObjectInputStream(fin)) {
            
            players.add((Player) ois.readObject());
            players.add((Player) ois.readObject());
            
        }
        

        return players;
        
    }
}
