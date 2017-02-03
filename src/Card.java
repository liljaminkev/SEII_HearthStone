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
  //specialAmmount is something like +1 attack, 
  //heal 2, poison -1, etc
    private int attackPoints, defensePoints, manaCost, specialAmmount;
    SpecialAbility specialAbility;

    public Card(int attackPoints, int defensePoints, int manaCost){
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.manaCost = manaCost;
    }

    //constructor for cards with special ammounts like poison, boost attack, heal etc
    public Card(int attackPoints, int defensePoints, int manaCost, int specialAmmount){
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.manaCost = manaCost;
        this.specialAmmount = specialAmmount;
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

    public void performSpecialAbility(){
        specialAbility.ability();
    }

    public void performSpecialAbility(Card cardA){
        specialAbility.ability(cardA, specialAmmount);
    }

    public void performSpecialAbility(Card cardA, Card cardB){
        specialAbility.ability(cardA, cardB, specialAmmount);
    }
    
    //this method allows a card to increment the players crystal count
    public void performSpecialMove(Card cardA, Player playerA){
        specialMove.move(cardA, playerA);
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
    public void setSpecialAbility(SpecialAbility ability){
        specialAbility = ability;
    }
}
