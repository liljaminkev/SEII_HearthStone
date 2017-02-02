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
    private int healthPoints = 30;
    private int armorPoints = 0;
    private int gems = 0;
    private int currentGems = 0;
    private Hand playerHand = new Hand(); 
    
    
    
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
    
    public void gainGem(){
      gems++;
    }
    public void resetCurrentGems()
    {
      currentGems = gems;
    }
    public void useGems(int gemCost)
    {
      currentGems = currentGems - gemCost;
    }
    public int getNumGems()
    {
      return gems;
    }
    public int getCurrentGems()
    {
      return currentGems;
    }
    
    
}
