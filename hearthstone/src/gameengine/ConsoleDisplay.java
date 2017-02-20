/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine;

import cards.Card;
import cards.SpecialAbility;

/**
 *
 * @author rodney
 */
public class ConsoleDisplay {


    public static String attackDisplay(Card attacker, Card attackee){
        return attacker.getCardName() + " attacked " + attackee.getCardName() + " for " + attacker.getAttackPoints() + " damage.\n";
    }

    public static String abilityDisplay(Card currentCard, SpecialAbility abilityUsed){
        return currentCard.getCardName() + " used " + abilityUsed.getAbilityName() + ".\n";
    }
}
