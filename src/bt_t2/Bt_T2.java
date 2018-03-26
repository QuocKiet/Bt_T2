/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_t2;
import Class.*;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Bt_T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        RobotManager rmng = new RobotManager();
//        rmng.input();
//        rmng.output();
//        rmng.maxpower();
//        rmng.sumPower();
//        
//          Point p1 = new Point(1, 3);
//          Point p2 = new Point(3, 3);
//          Point p3 = new Point(3, 1);
//          Point p4 = new Point(1, 1);
//         
//          Square s = new Square(p1, p2, p3, p4);
//          System.out.print(s.checkPointInShape(2, 2));
//          HotelAmara hotel = new HotelAmara();
//          hotel.input();
//          hotel.maxMoneyService();
//          System.out.println(hotel.sumMoneyService());

            ShapeManager m = new ShapeManager();
            m.input();
            m.outAreaAndPer();
            m.outCountShape();
            m.checkPointInShape(2, 2);
        
    }
    
}




