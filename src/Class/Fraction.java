/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;



/**
 *
 * @author user
 */
public class Fraction {
    protected int t,m;

    public Fraction() {
    }

    public Fraction(int t, int m) {
        this.t = t;
        this.m = m;
    }

    public Fraction(int t) {
        this.t = t;
        this.m = 1;
    }

    public int getT() {
        return t;
    }

    public int getM() {
        return m;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void setM(int m) {
        this.m = m;
    }
    
    public Fraction Compact(){
        int temp = t, temp1 = m;
        while(true){
            if(temp > temp1 )
                temp = temp -temp1;
            else if (temp < temp1)
                    temp1 = temp1 -temp;
            else
                break;
        }
        
       return new Fraction(t/temp, m/temp);
    }

    public Fraction mul(Fraction f){
        return new Fraction(t*f.getT(), m*f.getM()).Compact();
    }
    
    public Fraction div(Fraction f){
        return new Fraction(t*f.getM(), m*f.getT()).Compact();
    }
    
    public Fraction add(Fraction f){
        return new Fraction(t*f.getM() + m*f.getT(), m*f.getM()).Compact();
    }
    
    public Fraction sub(Fraction f){
        return new Fraction(t*f.getM() - m*f.getT(), m*f.getM()).Compact();
    }
}
