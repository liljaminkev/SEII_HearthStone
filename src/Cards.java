import java.util.ArrayList;
import java.util.List;
public abstract class Cards
{
    private List<Card> cards;
    
    public Cards()
    {
      cards = new ArrayList<Card>();
     
    }
    
    List<Card> returnCards(){
        return cards;
    }
    
    //Method to create available cards
    public void createAndAddCards(){
        Card coreHound = new CoreHound();
        cards.add(coreHound);
        
        Card magmaRager = new MagmaRager();
        cards.add(magmaRager);
        
        Card murlocScout = new MurlocScout();
        cards.add(murlocScout);
        
        Card bloodfenRaptor = new BloodfenRaptor();
        cards.add(bloodfenRaptor);
        
        Card bluegillWarrior = new BluegillWarrior();
        cards.add(bluegillWarrior);
        
        Card direWolfAlpha = new DireWolfAlpha();
        cards.add(direWolfAlpha);
        
        Card romulo = new Romulo();
        cards.add(romulo);
        
        Card timberWolf = new TimberWolf();
        cards.add(timberWolf);
        
        Card lightsJustice = new LightsJustice();
        cards.add(lightsJustice);
    }

    //returns a card from index location
    public Card showCard(int index)
    {
      return cards.get(index);
    }

    //Returns the amount of elements in array.
    public int getSize()
    {
        return cards.size();
    }

    //Removes a card from the card "pile"
    public void removeFrom(Card cardObject)
    {
      cards.remove(cardObject);
    }
}
