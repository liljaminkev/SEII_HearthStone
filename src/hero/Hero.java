package hero;
public abstract class Hero {
    private String heroName;
    private int healthPoints = 0;
    private int armorPoints = 0;
    private int attackPower = 0;

    public Hero(String name, int healthPoints){
        this.healthPoints = healthPoints;
        heroName = name;
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
    
    public void setHeroName(String name){
        heroName = name;
    }


//hooks for heros to implement
    public void damageArmor(int damageAmount){}
    public void gainArmor(int gainAmount){}
    public void attack(){}


}
