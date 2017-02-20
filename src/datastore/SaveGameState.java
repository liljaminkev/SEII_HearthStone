/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastore;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import playerassets.Player;

/**
 *
 * @author James
 */
public class SaveGameState {

    /**
     *
     * @param p1
     * @param p2
     * @param fileName
     * @throws FileNotFoundException
     * @throws IOException
     * Saves Player data to a specified file location
     */
    public static void saveFile(Player p1, Player p2, String fileName) throws FileNotFoundException, IOException{
        try ( //Create a text file to save the game data
                FileOutputStream fout = new FileOutputStream(fileName); ObjectOutputStream oos = new ObjectOutputStream(fout)) {
            oos.writeObject(p1);
            ObjectOutputStream writeObject = oos.writeObject(p2);
            //Save the game data to the file
        }
        
    }
}
