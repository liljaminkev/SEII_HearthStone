package cards;
import playerassets.Player;

public interface SpecialAbility
{
    public void ability();
    public void ability(Card a, int specialAmmount);
    public void ability(Card a, Card b, int specialAmmount);
    public void ability (Card a, Player playerA);
    //for player hero to add crystalspublic void ability();
    public String getAbilityName();
    public void setAbilityName(String name);
}
