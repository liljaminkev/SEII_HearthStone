package cards;

import abilities.SpecialAbility;
import abilities.BoostDefensePoints;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodney
 */
public class MagmaRager extends Card{
    public MagmaRager(){
        super(5, 1, 3);
        specialAbility = new BoostDefensePoints();
    }
    
}
