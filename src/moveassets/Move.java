package moveassets;
import playerassets.*;
import cards.Card;

public abstract class Move {
  private Card card;
  private Hand hand;
  private int indexOnField1;
  private int indexOnField2;
  private BattleField battleField1;
  private BattleField battleField2;
  private Player playerBeingAttacked;


  public Move(Hand hand, Card card, int index, BattleField battleField)
  {
    this.hand = hand;
    this.card = card;
    this.indexOnField1 = index;
    this.battleField1 = battleField;
  }
  public Move(int battleFieldIndexA, int battleFieldIndexB, BattleField battleFieldA, BattleField battleFieldB)
  {
    this.indexOnField1 = battleFieldIndexA;
    this.indexOnField2 = battleFieldIndexB;
    this.battleField1 = battleFieldA;
    this.battleField2 = battleFieldB;
  }

  public Move(Card card, Player player)
  {
    this.card = card;
    this.playerBeingAttacked = player;
  }


  public Card getCardToBeUsed()
  {
    return card;
  }

  public Hand getHand()
  {
    return hand;
  }

  public int getIndexOfField1()
  {
    return indexOnField1;
  }

  public int getIndexOfField2()
  {
    return indexOnField2;
  }

  public BattleField getBattleField1()
  {
    return battleField1;
  }
  public BattleField getBattleField2()
  {
    return battleField2;
  }

  public Player getPlayer()
  {
    return playerBeingAttacked;
  }
  /*
  public void placeCard(Hand playerHand, int handIndex, BattleField battlefield, int battlefieldIndex)
  {
      Card tempCard;
      tempCard = playerHand.showCard(handIndex);
      playerHand.removeCard(tempCard);
      battleField.addCard(battlefieldIndex, tempCard);
      battleFieldB.showCard(battleFieldIndexB);
  }*/

}
