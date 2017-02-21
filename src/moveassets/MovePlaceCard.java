package moveassets;
import junit.framework.TestCase;

public class MovePlaceCard extends Move{
  public MovePlaceCard(Hand hand, Card card, int index, BattleField battleField)
  {
    this.hand = hand;
    this.card = card;
    this.indexOnField1 = index;
    this.battleField1 = battleField;
  }

  public void execute()
  {
      battleField1.addCard(indexOnField1, hand.playCard(card));
  }
}
