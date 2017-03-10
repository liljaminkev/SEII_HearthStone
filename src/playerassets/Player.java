package playerassets;
import hero.Hero;
import java.io.Serializable;
import java.util.List;
import moveassets.Move;
public abstract class Player implements Serializable{
    private Hero hero;
    private Deck deck;
    private Hand hand;
    transient private BattleField field;

    public Player(Hero hero, Deck deck, Hand hand) {
        this.hero = hero;
        this.deck = deck;
        this.hand = hand;
        this.field = new BattleField(); //The field is initailly empty
    }

    public Hero getHero() {
        return hero;
    }

    public Deck getDeck() {
        return deck;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHero(Hero hero) {
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
    
    //take game state
    //ask for strat type
    //return move
    public Move pickMove(List<Player> players){
        Move move = null;
        
        
        
        return move;
    }
}
