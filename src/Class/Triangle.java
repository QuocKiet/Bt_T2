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
public class Triangle extends Geometry{
    private float edge1, edge2, edge3;
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
        edge1 = (float) p1.distance(p2);
        edge2 = (float) p2.distance(p3);
        edge3 = (float) p3.distance(p1);
    }

    public float getEdge1() {
        return edge1;
    }

    public void setEdge1(float edge1) {
        this.edge1 = edge1;
    }

    public float getEdge2() {
        return edge2;
    }

    public void setEdge2(float edge2) {
        this.edge2 = edge2;
    }

    public float getEdge3() {
        return edge3;
    }

    public void setEdge3(float edge3) {
        this.edge3 = edge3;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1.setX(p1.getX());
        this.p1.setY(p1.getY());
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2.setX(p2.getX());
        this.p2.setY(p2.getY());
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
       this.p3.setX(p3.getX());
       this.p3.setY(p3.getY());
    }
    

    public Triangle(float edge1, float edge2, float edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
        
    }

    public Triangle() {
        edge1 = 0;
        edge2 = 0;
        edge3 = 0;
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
    }
    
    /**
     *
     * @return
     */
    @Override
    public float perimeter(){
        return edge1+ edge2 + edge3;
    }
    
    /**
     *
     * @return
     */
    @Override
    public float area(){
        float p = perimeter()/2;
        return (float)Math.sqrt(p*(p - edge1)*(p - edge2)*(p - edge3));
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        float x1,x2,x3,y1,y2,y3;
        System.out.println("Nhap toa do x, y canh 1");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        
        System.out.println("Nhap toa do x, y canh 1");
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();
        
        System.out.println("Nhap toa do x, y canh 1");
        x3 = scanner.nextFloat();
        y3 = scanner.nextFloat();
        
        p1.setX(x1);
        p1.setY(y1);
        
        p2.setX(x2);
        p2.setY(y2);
        
        p3.setX(x3);
        p3.setY(y3);
        
        edge1 = p1.distance(p2);
        edge2 = p2.distance(p3);
        edge3 = p3.distance(p1);
    }

    @Override
    public boolean checkPointInShape(Point p) {
       Triangle temp1 = new Triangle(p, p1, p2);
       Triangle temp2 = new Triangle(p, p1, p3);
       Triangle temp3 = new Triangle(p, p2, p3);
       
       float areaTemp = temp1.area() + temp2.area() + temp3.area();
       return this.area() >= (areaTemp - 0.01);
    }
    

    @Override
    public boolean checkPointInShape(float x, float y) {
        Point temp = new Point(x, y);
        return checkPointInShape(temp); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
