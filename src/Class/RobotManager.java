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
public class RobotManager {
    private int n, s;
    private Robot r[];

    public RobotManager(int n, int s) {
        this.n = n;
        this.s = s;
        r = new Robot[n];
    }

    public RobotManager() {
        n = 0;
        s = 0;
    }

    public RobotManager(Robot[] r, int s) {
        this.r = r;
        this.s = s;
    }
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong robot: ");
        n = scanner.nextInt();
        System.out.println("Nhap so km can di: ");
        s = scanner.nextInt();
        r = new Robot[n];
            for (int i = 0; i < n; i++) {
                int choose =-1;
                System.out.println("Nhap loai Robot can them: ");
                choose = scanner.nextInt();
                switch (choose){
                    case 1:
                        r[i] = new Pedion(s);
                        break;
                    case 2:
                        r[i] = new  Zattacker(s);
                        break;
                    case 3:
                        r[i] = new Carrier(s);
                        break;
                    default:
                        r[i] = new Pedion(s);
                        break;
                }
            }
     }  
    
    public void output(){
          for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Loai robot %s", r[i].isType());
            System.out.println();
            r[i].output();
        }
    }
    
    public void maxpower(){
        float max = r[0].calPower();
        int flag =0;
        for (int i = 1; i < n; i++) {
            float temp = r[i].calPower();
            if(max < temp)
            {
                max= temp;
                flag = i;
            }
        }
        System.out.printf("Robot thu %d, loai %s la robot tieu thu nang luong nhieu nhat\nNang luong da tieu thu: %f",flag + 1,r[flag].isType(),max);
    }
    
    public void sumPower(){
        float sum =0;
        for (int i = 0; i < n; i++) {
            sum+= r[i].calPower();
        }
        System.out.println("\nTong nang luong: " + sum);
    }
    
}
