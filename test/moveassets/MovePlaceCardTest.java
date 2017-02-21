package test.moveassets;

import hero.Hero;
import hero.hearthstone.Jaina;
import junit.framework.TestCase;

public class MovePlaceCardTest extends TestCase{
    Move movePlaceCard;
    Player player;
    Hand hand;
    Deck deck;
    Hero hero = new Jaina();
    Romulo romulo = new Romulo();



    public void testPlaceWithCardInHand()
    {
        //setup move representation
        movePlaceCard = new MovePlaceCard(player.getHand(), romulo, 0, player.getBattleField());
        assertEquals(3, player.getHand().getNumCards());

        //execute representation
        movePlaceCard.execute();

        //test after execution
        assertEquals(2, player.getHand().getNumCards());
    }

    public void setUp()
    {
        deck = new Deck();
        hand = new Hand();
        BloodfenRaptor bloodfenRaptor = new BloodfenRaptor();
        BluegillWarrior bluegillWarrior = new BluegillWarrior();
        deck.addCard(0,bloodfenRaptor);
        hand.addCard(hand.getNumCards(), bloodfenRaptor);
        hand.addCard(hand.getNumCards(), bluegillWarrior);
        hand.addCard(hand.getNumCards(), romulo);
        player = new PlayerHearthStone(hero, deck, hand);
    }
}
