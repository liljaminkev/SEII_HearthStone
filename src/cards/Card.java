package cards;

import java.io.Serializable;
import playerassets.Player;

public abstract class Card implements Serializable{
    private String cardName;
    transient private int attackPoints;   // how much dmg the card does
    transient private int defensePoints;  // how much health/def points the card has = 0 dead
    transient private int cardCost;       // cost to play card
    transient private int specialAbilityAmmount; // special powers like poison, heal, boost atk
    transient private int cardTurn;       // if 1 allows card to attack
    transient SpecialAbility specialAbility;


    public Card(String cardName, int attackPoints, int defensePoints, int cardCost){
        this.cardName = cardName;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.cardCost = cardCost;
        this.cardTurn = 0;
    }

    //constructor for cards with special ammounts like poison, boost attack, heal etc
    public Card(int attackPoints, int defensePoints, int cardCost, int specialAbilityAmmount){
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.cardCost = cardCost;
        this.specialAbilityAmmount = specialAbilityAmmount;
        this.cardTurn = 0;
    }

    // Getters
    public int getAttackPoints(){
        return attackPoints;
    }

    public int getDefensePoints(){
        return defensePoints;
    }

    public int getCardCost(){
        return cardCost;
    }

    public void performSpecialAbility(){
        specialAbility.ability();
    }

    public void performSpecialAbility(Card cardA){
        specialAbility.ability(cardA, specialAbilityAmmount);
    }

    public void performSpecialAbility(Card cardA, Card cardB){
        specialAbility.ability(cardA, cardB, specialAbilityAmmount);
    }

    //this method allows a card to increment the players crystal count
    public void performSpecialAbility(Card cardA, Player playerA){
        specialAbility.ability(cardA, playerA);
    }

    //apply direct damage to the player
    public void performSpecialDamage(Card card, Player player ){
        specialAbility.ability(card, player);
    }

    public int getCardTurn(){
        return cardTurn;
    }

    public String getCardName(){
        return cardName;
    }

    //setters
    public void setSpecialAbilityAmmount(int specialAbilityAmmount){
        this.specialAbilityAmmount = specialAbilityAmmount;
    }
    public void setAttackPoints(int attackPoints){
        this.attackPoints =  attackPoints;
    }
    public void setDefensePoints(int defensePoints){
        this.defensePoints = defensePoints;
    }
    public void setCardCost(int cardCost){
        this.cardCost = cardCost;
    }
    public void setSpecialAbility(SpecialAbility ability){
        specialAbility = ability;
    }
    public void setCardTurn(int cardTurn){
        this.cardTurn = cardTurn;
    }
}
