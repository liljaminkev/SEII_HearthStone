package hero;
public abstract class Hero {
    private int healthPoints = 0;
    private int armorPoints = 0;
    private int attackPower = 0;

    public Hero(int healthPoints){
        this.healthPoints = healthPoints;
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
