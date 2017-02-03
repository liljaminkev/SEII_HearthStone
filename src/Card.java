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

    private int attackPoints;   // how much dmg the card does
    private int defensePoints;  // how much health/def points the card has = 0 dead
    private int manaCost;       // gem cost to play card
    private int specialAmmount; //special powers like poison, heal, boost atk
    private int cardTurn;   //card turn set to 1 at end of every turn
    SpecialAbility specialAbility;


    public Card(int attackPoints, int defensePoints, int manaCost){
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.manaCost = manaCost;
        this.cardTurn = 0;
    }

    //constructor for cards with special ammounts like poison, boost attack, heal etc
    public Card(int attackPoints, int defensePoints, int manaCost, int specialAmmount){
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.manaCost = manaCost;
        this.specialAmmount = specialAmmount;
        this.cardTurn = 0;
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

    /*
    //this method allows a card to increment the players crystal count
    public void performSpecialMove(Card cardA, Player playerA){
        specialAbility.Ability(cardA, playerA);
    }
    */
    public int getCardTurn(){
        return cardTurn;
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
    public void setCardTurn(int cardTurn){
        this.cardTurn = cardTurn;
    }
}
