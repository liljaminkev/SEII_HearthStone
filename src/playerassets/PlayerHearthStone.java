package playerassets;
import hero.Hero;
public class PlayerHearthStone extends Player {
    private static final int MAXCRYSTALS = 5;
    private int crystals;
    private int currentCrystalCount;

    public PlayerHearthStone(Hero hero, Deck deck, Hand hand){
        super(hero, deck, hand);
        crystals = 0; //player starts with crystal meter empty
    }

    public void setCurrentCrystals(int num){
        currentCrystalCount = num;
    }
    public int getCurrentCrystals() {
        return currentCrystalCount;
    }

    public void resetCurrentCrystals()
    {
        currentCrystalCount = crystals;
    }

    public void decCrystals(int dec)
    {
        currentCrystalCount = currentCrystalCount - dec;
    }

    //crystal count will be incremented at the beginning of each turn to a set max value
    public void incCrystals() {
        if(this.crystals < MAXCRYSTALS){
            this.crystals += 1;
        }
        else{
            crystals = MAXCRYSTALS;
        }
    }

    public int getCrystals(){
        return crystals;
    }

}
