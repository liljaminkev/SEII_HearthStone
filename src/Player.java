/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author James
 */

class Player {
    private static final int MAXCRYSTALS = 5;
    private int crystals;
    private PlayerHero hero;
    private Card[] deck;
    private Hand hand;
    private Field field;

    public Player(PlayerHero hero, Card[] deck, Hand hand) {
        this.hero = hero;
        this.deck = deck;
        this.hand = hand;
        this.field = null; //The field is initailly empty
        this.crystals = 0; //player starts with crystal meter empty
    }

    public PlayerHero getHero() {
        return hero;
    }

    public Card[] getDeck() {
        return deck;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHero(PlayerHero hero) {
        this.hero = hero;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }
    
    public Move pickMove(){
        Move selectedMove = new Move();
        
        return selectedMove;
    }

    public int getCrystals() {
        return crystals;
    }
    
    //crystal count will be incremented at the beginning of each turn to a set max value
    public void incCrystals() {
        if(this.crystals < MAXCRYSTALS){
            this.crystals += 1;
        }
    }
    
}