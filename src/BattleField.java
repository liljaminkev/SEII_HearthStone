//battle field represents the player's cards in play

import java.util.ArrayList;
import java.util.List;
public class BattleField extends Cards{

    /*
    protected List<Card> battleField = new ArrayList<Card>();

    // Setters
    public void addCard(Card cardToPlay){
        battleField.add(cardToPlay);
    }

    public void removeCard(Card cardToRemove){
        battleField.remove(cardToRemove);
    }

    // Getters
    public List<Card> returnBattleField(){
        return battleField;
    }
    // Helpers
    */
    public void checkBattleFieldCards(){
        for(Card selectedCard : battleField)
            if(selectedCard.getDefensePoints() <= 0)
                removeCard(selectedCard);    
    }

}
