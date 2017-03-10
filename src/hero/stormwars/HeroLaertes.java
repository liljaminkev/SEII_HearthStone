package hero.stormwars;
import hero.Hero;
import java.io.Serializable;
public class HeroLaertes extends Hero implements Serializable{
    public HeroLaertes(){
        super("Laertes", 26);
        this.setAttackPower(2);
    }
}
