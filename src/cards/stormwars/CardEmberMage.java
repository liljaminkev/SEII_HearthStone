/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards.stormwars;

import cards.Card;
import hero.Hero;

/**
 *
 * @author James
 * Saurian Scout is a 4 cost card with heavy defense
 */
public class CardEmberMage extends Card{
    
    public CardEmberMage(){
        super("Ember Mage", 4, 4, 2);
    }
    
    /**
     * 
     * @param target
     * @param dmgAmnt 
     * The special ability damages an opposing hero
     */
    public void ability(Hero target, int dmgAmnt){
        target.setHealthPoints(target.getHealthPoints() - dmgAmnt);
    }
    
}