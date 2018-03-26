/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Scanner;


/**
 *
 * @author user
 */
public class Circle extends Geometry {
    float r;
    Point i;

    public Circle() {
        r = 0;
        i = new Point(0,0);
    }

    public Circle(float r, Point p) {
        this.r = r;
        this.i = new Point(p);
    }

    @Override
    public boolean checkPointInShape(Point p) {
        if( r >= i.distance(p))
            return true;
        
        return false;
    }

    @Override
    public boolean checkPointInShape(float x, float y) {
        Point temp = new Point(x,y);
         if( r >= i.distance(temp))
            return true;
        
        return false;
    }

    @Override
    public float area() {
        return (float) (Math.PI*r*r);
    }
    
    public float perimeter(){
        return  (float)((float)2*Math.PI*r);
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public Point getI() {
        return i;
    }

    public void setI(Point i) {
        this.i.setX(i.getX());
        this.i.setY(i.getY());
    }
    
    public void input(){
        System.out.print("Nhap ban kinh va toa do x, y cho hinh tron:");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
        float temp1 = scanner.nextFloat();
        float temp2 = scanner.nextFloat();
        i = new Point(temp1,temp2);
    }
    
}
