package abilities;


import player.Player;
import cards.Card;

public interface SpecialAbility
{
    public void ability();
    public void ability(Card a, int specialAmount);
    public void ability(Card a, Card b, int specialAmount);
    public void ability (Card a, Player playerA);
    //for player hero to add crystalspublic void ability();
}
