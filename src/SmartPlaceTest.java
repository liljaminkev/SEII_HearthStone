import junit.framework.TestCase;
public class SmartPlaceTest extends TestCase{
    SmartPlace smartPlace = new SmartPlace();
    Player player;
    Hand hand;
    Deck deck;
    PlayerHero hero = new PlayerHero(15, 0);

    //gem count is 2 want to get bloodfenRaptor attack power of 3
    public void testPlaceWithCardInHand()
    {
        player.setCurrentCrystals(2);
        smartPlace.getLegalMove(player);
        assertEquals(3, player.getBattleField().showCard(0).getAttackPoints());
    }

    //gem count is 4 want to get romulo attack power of 4
    public void testPlaceWithCardInHand1()
    {
        player.setCurrentCrystals(4);
        smartPlace.getLegalMove(player);
        assertEquals(4, player.getBattleField().showCard(0).getAttackPoints());
    }


    //no cards in hand zero crystals
    public void testPlaceNoCardsInHand()
    {
        hand = new Hand();
        player = new Player(hero, deck, hand);
        player.setCurrentCrystals(4);
        assertEquals(0, smartPlace.getLegalMove(player));
    }

    public void testPlaceNoCrystals()
    {
        player.setCurrentCrystals(0);
        assertEquals(0, smartPlace.getLegalMove(player));
    }

    public void testPlaceNoCardsInHandNoCardsInDeck()
    {
        hand = new Hand();
        deck = new Deck();
        player = new Player(hero, deck, hand);
        player.setCurrentCrystals(0);
        assertEquals(-1, smartPlace.getLegalMove(player));
    }



    @Override
    public void setUp()
    {
        deck = new Deck();
        hand = new Hand();
        BloodfenRaptor bloodfenRaptor = new BloodfenRaptor();
        Romulo romulo = new Romulo();
        BluegillWarrior bluegillWarrior = new BluegillWarrior();
        deck.addCard(0,bloodfenRaptor);
        hand.addCard(hand.getNumCards(), bloodfenRaptor);
        hand.addCard(hand.getNumCards(), bluegillWarrior);
        hand.addCard(hand.getNumCards(), romulo);
        player = new Player(hero, deck, hand);
    }
}
