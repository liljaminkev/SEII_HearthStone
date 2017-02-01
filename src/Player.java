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
    private PlayerHero hero;
    private Card[] deck;
    private Hand hand;
    private Field field;

    public Player(PlayerHero hero, Card[] deck, Hand hand) {
        this.hero = hero;
        this.deck = deck;
        this.hand = hand;
        this.field = null; //The field is initailly empty
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
    
    
}
