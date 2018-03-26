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
public class Point {
    private float x,y;
    
    public Point(float x, float y){
        this.x =x;
        this.y =y;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    
    public float distance(Point p){
        return (float) Math.sqrt(Math.pow((this.x - p.getX()), 2) + Math.pow((this.y - p.getY()), 2));
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(Point p){
        this.x = p.getX();
        this.y = p.getY();
    }
}
