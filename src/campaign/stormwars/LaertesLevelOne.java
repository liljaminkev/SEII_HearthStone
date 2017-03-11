/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campaign.stormwars;
import cards.Card;
import static cards.GenerateCards.generateStormWarsCards;
import hero.stormwars.HeroLaertes;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import playerassets.Deck;
import playerassets.Hand;
import playerassets.Player;
import playerassets.PlayerStormWars;

/**
 *
 * @author rodney
 */
public class LaertesLevelOne implements Serializable{

    private Player enemy;
    
    public LaertesLevelOne(){
        enemy = new PlayerStormWars(new HeroLaertes(), new Deck(), new Hand());
    }
    
    // Method that returns the enemy of level one
    public Player getEnemy(){
        return enemy;
    }
    
    // Sets the deck of the enemy player
    public void setDeck(){
        List<Card> cards;
        
        List<String> cardNames = new ArrayList<>();
        cardNames.add("DREAMDUST");
        cardNames.add("DREAMDUST");
        cardNames.add("PRODROMOI");
        cardNames.add("PRODROMOI");
        
        cards = generateStormWarsCards(cardNames);
        
        for(Card currentCard : cards){
            enemy.getDeck().addCard(currentCard);
        }
    }
}
