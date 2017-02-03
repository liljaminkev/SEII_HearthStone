/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 * 
 */
public class BluegillWarrior extends Card {
    private int attackPoints, defensePoints, manaCost;
    
    public BluegillWarrior() {
        super(2, 1, 2);
        specialAbility = new BoostCrystals();
    }
}
