/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author TuKyCoDoN
 */
public class ShapeManager {
    private int n;
    private Geometry g[];
    private int countR, countTr, countC, countS;
    public ShapeManager() {
       n = 0;
       countR =0;
       countC = 0;
       countS = 0;
       countTr =0;
    }

    public ShapeManager(int n) {
        this.n = n;
        g = new Geometry[n];
        countR =0;
        countC = 0;
        countS = 0;
        countTr =0;
    }
    
    public void input(){
        System.out.println("Nhap so luong hinh:");
        System.out.println("1. Tron\n2. Tam giac\n3.Vuong\n4. Chu nhat");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        g = new Geometry[n];
        int choose = -1;
        for (int i = 0; i < n; i++) {
           System.out.print("Chon hinh");
           choose = scanner.nextInt();
           switch (choose){
               case 1:{
                   g[i] = new Circle();
                   g[i].input();
                   countC++;
                   break;
               }
               case 2:{
                   g[i]= new Triangle();
                   g[i].input();
                   countTr++;
                   break;
               }
               case 3:{
                   g[i] = new Square();
                   g[i].input();
                   countS++;
                   break;
               }
               case 4:{
                   g[i] = new Rectangle();
                   g[i].input();
                   countR++;
                   break;
               }
               default:{
                   g[i] = new Circle();
                   g[i].input();
                   countC++;
                   break;
               }      
           }
        }
    }

    public int getCountR() {
        return countR;
    }

    public int getCountTr() {
        return countTr;
    }

    public int getCountC() {
        return countC;
    }

    public int getCountS() {
        return countS;
    }
    
    public void outAreaAndPer(){
        for (int i = 0; i < n; i++) {
            System.out.println("Chu vi hinh " + (i+1) +" :" +g[i].perimeter() );
            System.out.println("Dien tich hinh " + (i+1) +" :" +g[i].area());
        }
    }
    
    public void outCountShape(){
        System.out.println("So luong hinh chu nhat la: " + countR);
        System.out.println("So luong hinh vuong la: " + countS);
        System.out.println("So luong hinh tam giac la: " + countTr);
        System.out.println("So luong hinh tron la: " + countC);

    }
    
    public void checkPointInShape(float x, float y){
        for (int i = 0; i < n; i++) {
            System.out.println("Hinh " + (i+1) + " " + g[i].checkPointInShape(x, y));
        }
    }
}
