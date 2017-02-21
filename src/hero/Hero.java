package hero;

import java.io.Serializable;

public abstract class Hero implements Serializable{
    String heroName;
    transient private int healthPoints = 0;
    transient private int armorPoints = 0;
    transient private int attackPower = 0;

    public Hero(String heroName, int healthPoints){
        this.healthPoints = healthPoints;
        this.heroName = heroName;
    }

    //setters
    public void setAttackPower(int atkpower){
        this.attackPower = atkpower;
    }

    // Getters
    public int getHealthPoints(){
        return healthPoints;
    }

    public void setHealthPoints(int ammount){
        healthPoints = ammount;
    }


//hooks for heros to implement
    public void damageArmor(int damageAmount){}
    public void gainArmor(int gainAmount){}
    public void attack(){}


}
