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
public class Zattacker extends Robot {
    private float p;

   

    public Zattacker(float s) {
        this.s = s;
        m =50;
        p = (float)(20 + Math.random()*10);
    }

    public Zattacker() {
        p = (float)(20 + Math.random()*10);
        m =50;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }
    public float calPower(){
        return (m*s+p*p*s);
    }
   
    public String isType(){
        return "Zattacker";
    }
     
    public void output(){
        System.out.printf("Khoi luong: %f\nSuc manh: %f\nNang luong tieu thu: %f",m,p,this.calPower());
    }
}
