package moveassets;
import cards.Card;
import hero.Hero;

public abstract class Move {
  Card card;
  Hand hand;
  int indexOnField1;
  int indexOnField2;
  BattleField battleField1;
  BattleField battleField2;
  Hero heroBeingAttacked;

  //place Card
  public Move(){}

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

  public Hero getHeroBeingAttacked()
  {
    return heroBeingAttacked;
  }

  public void execute(){};


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
