/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 * 
 */
public class BluegillWarrior extends Card implements SpecialMove{
    private int attackPoints, defensePoints, manaCost;
    
    /**
     *
     */
    public BluegillWarrior() {
        super(2, 1, 2);
    }
    
    //implement 

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(Card a, int specialAmmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(Card a, Card b, int specialAmmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param p
     */
    @Override
    public void move(Card a, Player p) {
        p.incCrystals();
    }
    
}
