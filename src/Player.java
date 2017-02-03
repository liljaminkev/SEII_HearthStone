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
    private int currentCrystalCount;
    private PlayerHero hero;
    private Deck deck;
    private Hand hand;
    private BattleField field;

    public Player(PlayerHero hero, Deck deck, Hand hand) {
        this.hero = hero;
        this.deck = deck;
        this.hand = hand;
        this.field = new BattleField(); //The field is initailly empty
        crystals = 0; //player starts with crystal meter empty
    }

    public PlayerHero getHero() {
        return hero;
    }

    public Deck getDeck() {
        return deck;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHero(PlayerHero hero) {
        this.hero = hero;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public BattleField getBattleField() {
        return field;
    }

    public void setField(BattleField field) {
        this.field = field;
    }

    public Move pickMove(){
        Move selectedMove = new Move();

        return selectedMove;
    }
    public void setCurrentCrystals(int num){
        currentCrystalCount = num;
    }
    public int getCurrentCrystals() {
        return currentCrystalCount;
    }

    public void resetCurrentCrystals()
    {
        currentCrystalCount = crystals;
    }

    public void decCrystals(int dec)
    {
        currentCrystalCount = currentCrystalCount - dec;
    }

    //crystal count will be incremented at the beginning of each turn to a set max value
    public void incCrystals() {
        if(this.crystals < MAXCRYSTALS){
            this.crystals += 1;
        }
    }

}
