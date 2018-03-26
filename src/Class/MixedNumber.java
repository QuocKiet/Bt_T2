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
public class MixedNumber extends Fraction{
    int back;

    public MixedNumber() {
        back = 0;
        t = 0;
        m = 1;
    }
    public MixedNumber(Fraction f){
        Fraction temp = f.Compact();
        m = temp.m;
        t = temp.t % temp.m;
        back = temp.t / temp.m;
    }

    public MixedNumber(int back, int t, int m) {
        super(t, m);
        this.back = back;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }
    
    public Fraction convertFraction(){
        return new Fraction(back*m +t,m);
    }
    
    public MixedNumber add(MixedNumber m){
        Fraction f = m.convertFraction();
        Fraction f1 = this.convertFraction();
        return new MixedNumber(f.add(f1));
    }
    public MixedNumber sub(MixedNumber m){
        Fraction f = m.convertFraction();
        Fraction f1 = this.convertFraction();
        return new MixedNumber(f.sub(f1));
    }
   
    public MixedNumber mul(MixedNumber m){
        Fraction f = m.convertFraction();
        Fraction f1 = this.convertFraction();
        return new MixedNumber(f.mul(f1));
    }
    
    public MixedNumber div(MixedNumber m){
        Fraction f = m.convertFraction();
        Fraction f1 = this.convertFraction();
        return new MixedNumber(f.div(f1));
    }
    
}
