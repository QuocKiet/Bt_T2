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
public class TeleService extends Service {

    public TeleService() {
        super(0,0);
    }

    public TeleService(float cost, float amount) {
        super(cost, amount);
    }

  public float getMoneyService(){
      float temp = cost*amount;
      if(temp > 300000)
          return 300000 + (temp - 300000)*0.8f;
      else 
          return temp;
  }
    
    
    

}
