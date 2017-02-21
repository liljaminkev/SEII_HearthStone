package gameengine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import playerassets.Player;
import cards.Card;
import java.util.List;

/**
 *
 * @author James
 */
public class HearthDuel extends Duel{

    int currentPlayer = 0;

    public HearthDuel(List<Player> _players) {
        super(_players);
    }


    @Override
    protected Player findWinner() {
        if(players.get(0).getHero().getHealthPoints() <= 0){
            return players.get(1);
        }
        else if(players.get(1).getHero().getHealthPoints() <= 0){
            return players.get(0);
        }
        else{
            return null;
        }
    }

     @Override
     protected void beforeTurn(){
        Player player = players.get(currentPlayer);

        //Set player mana for current round
        player.incCrystals();
        player.setCurrentCrystals(player.getCrystals());

        //Add a new card to the players hand from the deck
        player.getHand().addCard(player.getDeck().returnTopCard());

        //Print cards on the battle field
        System.out.println("Field Cards:");
        for(Card inField : player.getBattleField().returnBattleField()){
            System.out.println(inField.toString());
        }
        System.out.println("End field cards.");

    }

    @Override
    protected void afterTurn(){
        Player player = players.get(currentPlayer);

        //Check for and remove cards that have died
        players.get(0).getBattleField().checkBattleFieldCards();
        players.get(1).getBattleField().checkBattleFieldCards();

        if(currentPlayer == 0){
            currentPlayer = 1;
        }
        else{
            currentPlayer = 0;
        }
    }

}
