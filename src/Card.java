/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodney
 */
public abstract class Card {
    private int attackPoints, defensePoints, manaCost;
    SpecialMove specialMove;

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

    public void performSpecialMove(){
        specialMove.move();
    }

    //setters
    public void setAttackPoints(int attackPoints){
        this.attackPoints =  attackPoints;
    }
    public void setDefensePoints(int defensePoints){
        this.defensePoints = defensePoints;
    }
    public void setManaCost(int manaCost){
        this.manaCost = manaCost;
    }
    public void setSpecialMove(SpecialMove move){
        specialMove = move;
    }
}
