/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author TuKyCoDoN
 */
public class FlowerService extends Service {

    public FlowerService() {
        super(0,0);
    }

    public FlowerService(float cost, float amount) {
        super(cost, amount);
    }
    
    public float getMoneyService(){
        return cost*amount;
    }
    
}
