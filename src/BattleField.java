//battle field represents the player's cards in play

import java.util.ArrayList;
import java.util.List;
public class BattleField /*extends Cards*/{
    protected List<Card> battlefield = new ArrayList<Card>();
    
    // Setters
    public void addCard(Card cardToPlay){
        battlefield.add(cardToPlay);
    }
    
    public void removeCard(Card cardToRemove){
        battlefield.remove(cardToRemove);
    }
    
    // Getters
    
    // Helpers
    public void checkBattleFieldCards(){
        for(Card selectedCard : battlefield){
            if(selectedCard.getDefensePoints() <= 0){
                removeCard(selectedCard);
            }
        }
    }
    
}
