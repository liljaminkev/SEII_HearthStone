package moveassets;
import cards.Card;
import playerassets.BattleField;
import playerassets.Hand;

public class MovePlaceCard extends Move{
  public MovePlaceCard(Hand hand, Card card, int index, BattleField battleField)
  {
    this.hand = hand;
    this.card = card;
    this.indexOnField1 = index;
    this.battleField1 = battleField;
  }

    public MovePlaceCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  @Override
  public void execute()
  {
      battleField1.addCard(indexOnField1, hand.playCard(card));
  }
}
