/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerassets;

/**
 *
 * @author James
 */
class Player {
    private PlayerHero hero;
    private Card[] deck;
    private Card[] hand;

    public Player(PlayerHero hero, Card[] deck, Card[] hand) {
        this.hero = hero;
        this.deck = deck;
        this.hand = hand;
    }

    public PlayerHero getHero() {
        return hero;
    }

    public Card[] getDeck() {
        return deck;
    }

    public Card[] getHand() {
        return hand;
    }

    public void setHero(PlayerHero hero) {
        this.hero = hero;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    public Move pickMove(){
        Move selectedMove = new Move();

        return selectedMove;
    }


}
