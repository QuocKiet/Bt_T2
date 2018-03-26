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
public class Carrier extends Robot {
    private float e;

    public Carrier() {
        m =30;
        e = (float)(50 + Math.random()*50);
    }


    public float calPower(){
        return(m*s + 4*e*s);
    }
    
    public String isType(){
        return "Carrier";
    }

    public Carrier(float s) {
        super(s);
        e = (float)(50 + Math.random()*50);
        m = 30;
    }
    public void output(){
        System.out.printf("Khoi luong: %f\nKho nang luong: %f\nNang luong tieu thu: %f",m,e,this.calPower());
    }
    
  
}
