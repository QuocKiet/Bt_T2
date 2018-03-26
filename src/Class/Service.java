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
public class Service {
    protected float cost, amount;

    public Service() {
        cost = 0;
        amount = 0;
    }

    public Service(float cost, float amount) {
        this.cost = cost;
        this.amount = amount;
    }

    public float getCost() {
        return cost;
    }

    public float getAmount() {
        return amount;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    public float getMoneyService(){
        return 0;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap don gia va thoi luong su dung dich vu");
        cost = scanner.nextInt();
        amount = scanner.nextInt();
    }
}
