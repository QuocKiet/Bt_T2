/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author TuKyCoDoN
 */
public class CarRentService extends Service {
    public CarRentService() {
        this.cost = 0;
        this.amount = 0;
    }

    public CarRentService(float cost, float time) {
        this.cost = cost;
        this.amount = time;
    }
    
    public float getMoneyService(){
        if (amount >= 6 && amount < 72){
            return (cost*amount)*0.95f;
        }else if (amount < 6){
            return amount*cost;
        }else
            return ((cost*amount)*0.95f)*0.98f;
    }
    
}
