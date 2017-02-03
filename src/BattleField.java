//battle field represents the player's cards in play

import java.util.ArrayList;
import java.util.List;
public class BattleField{
private List<Card> BattleField;

  public BattleField()
  {
    BattleField = new ArrayList<Card>();
  }

  //add new card to BattleField
  public void addToBattleField(Card newCard)
  {
    BattleField.add(newCard);
  }
  
  public void removeFromBattleField(int cardIndex)
  {
    BattleField.remove(cardIndex);
  }
  //returns a card from index location
  public Card showCard(int index)
  {
    return BattleField.get(index);
  }
}
