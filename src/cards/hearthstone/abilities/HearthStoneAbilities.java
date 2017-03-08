/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards.hearthstone.abilities;
import cards.Card;
import cards.SpecialAbility;
import playerassets.PlayerHearthStone;
/**
 *
 * @author Kevin
 */
public interface HearthStoneAbilities extends SpecialAbility{
    public void ability(Card card, PlayerHearthStone playerA);
}
