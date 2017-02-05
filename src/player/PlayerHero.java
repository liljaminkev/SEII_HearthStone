package player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodney
 */
public class PlayerHero {
    private int healthPoints;
    private int armorPoints;
    
    public PlayerHero(){
        healthPoints = 30;
        armorPoints = 0;
    }

    public PlayerHero(int healthPoints, int armorPoints){
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
