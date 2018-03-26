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
public class Pedion extends Robot {
    private float f;

    public Pedion() {
        this.m = 20;
        this.f = (float)(1+ Math.random()*4);
    }

    public Pedion( float s) {
        super(s);
        m =20;
        this.f = (float)(1+ Math.random()*4);
    }
    
    public float calPower(){
        return (m*s+(f+1)*(s/2));
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }
    public String isType(){
        return "Pendion";
    }
     public void output(){
        System.out.printf("Khoi luong: %f\nDo linh hoat: %f\nNang luong tieu thu: %f",m,f,this.calPower());
    }
}
