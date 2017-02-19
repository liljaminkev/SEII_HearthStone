package hero;
public class Hero {
    private int healthPoints;
    private int armorPoints;

    public Hero(){
        healthPoints = 30;
        armorPoints = 0;
    }

    public Hero(int healthPoints, int armorPoints){
        this.healthPoints = healthPoints;
        this.armorPoints = armorPoints;
    }

    // Getters
    public int getHealthPoints(){
        return healthPoints;
    }

    // Mutators
    public void damageHealth(int damageAmount){
        healthPoints -= damageAmount;
    }

    public void healHealth(int healAmount){
        healthPoints += healAmount;
    }

    public void damageArmor(int damageAmount){
        if((armorPoints - damageAmount) <= 0){
            armorPoints = 0;
        }
        else{
            armorPoints -= damageAmount;
        }
    }
    public void gainArmor(int gainAmount){
        armorPoints += gainAmount;
    }


}
