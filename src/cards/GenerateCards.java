/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;
import java.util.List;
import cards.hearthstone.*;
import cards.stormwars.*;

/**
 *
 * @author rodney
 */
public final class GenerateCards {
    
    // Generates cards from the available hearthstone classes
    public static List<Card> generateHearthStoneCards(List<String> cardNames){
        List<Card> cardList = new ArrayList<>();
        Card tempCard;

        for(String current : cardNames){
            if(current.equalsIgnoreCase("BLOODFENRAPTOR")){
                tempCard = new BloodfenRaptor();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("BLUEGILLWARRIOR")){
                tempCard = new BluegillWarrior();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("COREHOUND")){
                tempCard = new CoreHound();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("CROCOLISK")){
                tempCard = new Crocolisk();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("DIREWOLFALPHA")){
                tempCard = new DireWolfAlpha();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("FIREBALL")){
                tempCard = new Fireball();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("LIGHTSJUSTICE")){
                tempCard = new LightsJustice();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("MAGMARAGER")){
                tempCard = new MagmaRager();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("MURLOCSCOUT")){
                tempCard = new MurlocScout();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("NIGHTBLADE")){
                tempCard = new NightBlade();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("ROMULO")){
                tempCard = new Romulo();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("TIMBERWOLF")){
                tempCard = new TimberWolf();
                cardList.add(tempCard);
            }
            else{
                tempCard = new Romulo();
                cardList.add(tempCard);
            }
        }

        return cardList;
    }

    public static List<Card> generateStormWarsCards(List<String> cardNames){
        List<Card> cardList = new ArrayList<>();
        Card tempCard;

        for(String current : cardNames){
            if(current.equalsIgnoreCase("DREAMDUST")){
                tempCard = new CardDreamDust();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("PRODROMOI")){
                tempCard = new CardProdromoi();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("SAURIANSCOUT")){
                tempCard = new CardSaurianScout();
                cardList.add(tempCard);
            }
            else if(current.equalsIgnoreCase("SWORDSMAN")){
                tempCard = new CardSwordsman();
                cardList.add(tempCard);
            }
            else{
                tempCard = new CardDreamDust();
                cardList.add(tempCard);
            }
        }

        return cardList;
    }
}
