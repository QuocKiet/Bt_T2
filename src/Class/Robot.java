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
public class Robot {
    protected float m, s;

    public Robot() {
        this.m =0;
        this.s=0;
    }

    public Robot(float s) {
        this.s = s;
    }

    public float getM() {
        return m;
    }

    public float getS() {
        return s;
    }

    public void setM(float m) {
        this.m = m;
    }

    public void setS(float s) {
        this.s = s;
    }

    public float calPower(){
      return 0;  
    }
    public String isType(){
        return"";
    }
   public void output(){
       
   }
}
