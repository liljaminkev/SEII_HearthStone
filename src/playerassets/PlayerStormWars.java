package playerassets;

import hero.Hero;
import java.io.Serializable;
public class PlayerStormWars extends Player implements Serializable {

    public PlayerStormWars(Hero hero, Deck deck, Hand hand){
        super(hero, deck, hand);
    }

}
