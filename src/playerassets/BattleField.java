package playerassets;

//battle field represents the player's cards in play

import cards.Card;
import java.io.Serializable;
import java.util.List;

public class BattleField extends Cards implements Serializable{
    
    public BattleField(){
        super();
    }
    
    // Method to check cards that have died (0 healthpoints)
    public void checkBattleFieldCards(){
        for(Card selectedCard : cards)
            if(selectedCard.getDefensePoints() <= 0)
                removeCard(selectedCard);
    }

    // Returns the list of cards currently in the battlefield
    public List<Card> getBattleFieldList(){
        return cards;
    }

}
