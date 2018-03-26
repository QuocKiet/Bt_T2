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
public class HotelAmara {
    private int nc, nf, nt;
    private CarRentService c[];
    private FlowerService f[];
    private TeleService t[];
    
    public HotelAmara() {
        nc = 0;
        nf = 0;
        nt = 0;
    }

    public HotelAmara(int nc, int nf, int nt) {
        this.nc = nc;
        this.nf = nf;
        this.nt = nt;
        
        c = new CarRentService[nc];
        t = new TeleService[nt];
        f = new FlowerService[nf];
    }
    public void input(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so lan su dung dich vu thue xe");     
        nc = scanner.nextInt();
        System.out.println("Nhap so lan su dung dich vu dien thoai");     
        nt = scanner.nextInt();
        System.out.println("Nhap so lan su dung dich vu tang hoa");     
        nf = scanner.nextInt();
        
        c = new CarRentService[nc];
        t = new TeleService[nt];
        f = new FlowerService[nf];
        
        System.out.println("Nhap thong tin dich vu thue xe");
        for (int i = 0; i < nc; i++) {
            c[i] = new CarRentService();
            c[i].input();
        }
        
        System.out.println("Nhap thong tin dich vu dien thoai");
        for (int i = 0; i < nt; i++) {
            t[i]= new TeleService();
            t[i].input();
        }
        
        System.out.println("Nhap thong tin dich vu tang hoa");
        for (int i = 0; i < nf; i++) {
            f[i]= new FlowerService();
            f[i].input();
        }
    }
    
    public void maxMoneyService(){
        float sumc =0;
        float sumf =0;
        float sumt =0;
        for (int i = 0; i < nc; i++) {
            sumc += c[i].getMoneyService();
        }
        
        for (int i = 0; i < nt; i++) {
            sumt += t[i].getMoneyService();
        }
        
        for (int i = 0; i < nf; i++) {
            sumf += f[i].getMoneyService();
        }
        float max = Math.max(sumc, sumf);
        max = Math.max(max, sumt);
        if (max == sumt)
                System.out.println("Dich vu dien thoai co tien su dung nhieu nhat");
        else if(max == sumf)
                 System.out.println("Dich vu tang hoa co tien su dung nhieu nhat");
        else 
             System.out.println("Dich vu thue xe co tien su dung nhieu nhat");  
    }
    
    public float sumMoneyService(){
       
        float sum =0;
        for (int i = 0; i < nc; i++) {
            sum += c[i].getMoneyService();
        }
        
        for (int i = 0; i < nt; i++) {
            sum += t[i].getMoneyService();
        }
        
        for (int i = 0; i < nf; i++) {
            sum += f[i].getMoneyService();
        }
        return sum;
    }
}

