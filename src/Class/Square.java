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
public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }
    
    public Square(float width){
        this.width = width;
        this.height= width;
    }
    public float perimeter(){
        return width*4;
    }
    
    public float area(){
        return width*width;
    }

    @Override
    public void setP4(Point p) {
        super.setP4(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setP3(Point p) {
        super.setP3(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setP2(Point p) {
        super.setP2(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setP1(Point p) {
        super.setP1(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setP4(float x, float y) {
        super.setP4(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setP3(float x, float y) {
        super.setP3(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setP2(float x, float y) {
        super.setP2(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setP1(float x, float y) {
        super.setP1(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getP4() {
        return super.getP4(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getP3() {
        return super.getP3(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getP2() {
        return super.getP2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getP1() {
        return super.getP1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkPointInShape(float x, float y) {
        return super.checkPointInShape(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkPointInShape(Point p) {
        return super.checkPointInShape(p); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public void input() {
        super.input(); 
    }
    
}
