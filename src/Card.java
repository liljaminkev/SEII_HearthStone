/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodney
 */
public class Card {
    private int attackPoints, defensePoints, manaCost;
    
    public Card(int attackPoints, int defensePoints, int manaCost){
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.manaCost = manaCost;
    }
    
    // Getters
    public int getAttackPoints(){
        return attackPoints;
    }
    
    public int getDefensePoints(){
        return defensePoints;
    }
    
    public int getManaCost(){
        return manaCost;
    }
}
