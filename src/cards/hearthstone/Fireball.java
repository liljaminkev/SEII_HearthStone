package cards.hearthstone;


import abilityassets.DamageAttack;
import cards.Card;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bashi.aquino
 */

//Fireball will deal 6 damage to the PlayerHero
public class Fireball extends Card {

    public Fireball()
    {
        super(6, 0, 4);
        specialAbility = new DamageAttack();
    }
}
