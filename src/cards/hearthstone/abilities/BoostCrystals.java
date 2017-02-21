package cards.hearthstone.abilities;
import player.Player;
import cards.Card;
import abilities.SpecialAbility;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class BoostCrystals implements SpecialAbility{

    @Override
    public void ability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ability(Card a, int specialAmmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ability(Card a, Card b, int specialAmmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ability(Card a, Player playerA) {
        playerA.incCrystals();
    }



}
