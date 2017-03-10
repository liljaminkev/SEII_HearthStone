package hero.hearthstone;
import hero.Hero;
import java.io.Serializable;
public class Jaina extends Hero implements Serializable{
    public Jaina(){
        super("Jaina", 20);
        this.setAttackPower(2);
    }
}
