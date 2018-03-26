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
public class Rectangle extends Geometry{
     protected float width, height;
     protected Point p1, p2,p3,p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
        this.p4 = new Point(p4);
        width = (float) p1.distance(p2);
        height = (float) p1.distance(p4);
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

   
   public float perimeter(){
     return (this.width + this.height)*2;
   }
   
   public float area(){
       return this.width*this.height;
   }

    public Rectangle() {
        width = 0;
        height = 0;
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
        p4 = new Point();
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP1(float x, float y) {
        p1.setX(x);
        p1.setY(y);
    }

    public void setP2(float x, float y) {
        p2.setX(x);
        p2.setY(y);
    }

    public void setP3(float x, float y) {
        p3.setX(x);
        p4.setY(y);
    }

    public void setP4(float x, float y) {
        p4.setX(x);
        p4.setY(y);
    }

    public void setP1(Point p) {
        p1.setX(p.getX());
        p1.setY(p.getY());
    }

    public void setP2(Point p) {
        p2.setX(p.getX());
        p2.setY(p.getY());
    }

    public void setP3(Point p) {
        p3.setX(p.getX());
        p3.setY(p.getY());
    }

    public void setP4(Point p) {
        p4.setX(p.getX());
        p4.setY(p.getY());
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        float x1,x2,x3,x4,y1,y2,y3,y4;
        System.out.println("Nhap toa do dinh 1");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        
        System.out.println("Nhap toa do dinh 2");
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();
        
        System.out.println("Nhap toa do dinh 3");
        x3 = scanner.nextFloat();
        y3 = scanner.nextFloat();
        
        System.out.println("Nhap toa do dinh 4");
        x4 = scanner.nextFloat();
        y4 = scanner.nextFloat();
        
        p1.setX(x1);
        p1.setY(y1);
        
        p2.setX(x2);
        p2.setY(y2);
        
        p3.setX(x3);
        p3.setY(y3);
        
        p4.setX(x4);
        p4.setY(y4);
        
        width = (float) p1.distance(p2);
        height = (float) p1.distance(p4);
    }

    @Override
    public boolean checkPointInShape(Point p) {
       Triangle temp1 = new Triangle(p, p1, p2);
       Triangle temp2 = new Triangle(p, p1, p4);
       Triangle temp3 = new Triangle(p, p2, p3);
       Triangle temp4 = new Triangle(p, p3, p4);
       
       
       float areaTemp = temp1.area() + temp2.area() + temp3.area() + temp4.area();
       return this.area() >= (areaTemp - 0.01);
    }

    @Override
    public boolean checkPointInShape(float x, float y) {
        Point p = new Point(x, y);
        return this.checkPointInShape(p);
    }
    
   
}
