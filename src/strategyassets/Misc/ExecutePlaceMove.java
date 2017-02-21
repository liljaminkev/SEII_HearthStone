package strategyassets.Misc;

public class ExecutePlaceMove implements Command {
  Move placeMove;
  
  public void ExecutePlaceMove(Move move)
  {
    this.placeMove = move;
  }
  
  public void execute()
  {

    placeMove.getBattleField1().addCard(placeMove.getIndexOfField1(), placeMove.getCardToBeUsed());
    placeMove.getHand().removeCard(placeMove.getCardToBeUsed());
  }
}