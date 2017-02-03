//hand contains an arrayList of cards, a counter
import java.util.ArrayList;
import java.util.List;
public class Hand /*extends Cards*/{
    protected List<Card> playerHand;
    
    public Hand(){
        playerHand = new ArrayList<Card>();
    }
    
    // Getter methods
    public Card getCard(int index){
        return playerHand.get(index);
    }
    
    // Helper methods
    public void addCard(Card cardToAdd){
        playerHand.add(cardToAdd);
    }
    
    public void removeCard(Card cardToRemove){
        playerHand.remove(cardToRemove);
    }
    
}
