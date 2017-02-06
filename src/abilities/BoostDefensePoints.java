/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abilities;

import cards.Card;
import player.Player;

/**
 *
 * @author rodney
 */
public class BoostDefensePoints implements SpecialAbility{

    @Override
    public void ability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //Raises health by specified amount
    @Override
    public void ability(Card a, int specialAmount) {
        a.setDefensePoints(a.getDefensePoints() + specialAmount);
    }

    @Override
    public void ability(Card a, Card b, int specialAmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ability(Card a, Player playerA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
