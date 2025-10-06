/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04010;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Point {
    private double x , y ; 

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int t = sc.nextInt() ; 
        
        while (t -- >  0 ) {
            
            Point a = new Point (sc.nextDouble() , sc.nextDouble()) ; 
            Point b = new Point (sc.nextDouble() , sc.nextDouble()) ; 
            Point c = new Point (sc.nextDouble() , sc.nextDouble()) ; 
            
            
            
            double canh1 = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY())  ) ; 
            double canh2 = Math.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY())) ; 
            double canh3 = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY())) ; 
            
           
            
            if ( (canh1 + canh2 > canh3 ) && (canh2 + canh3 > canh1 ) && ( canh1 + canh3 > canh2)) {
                double dt = Math.sqrt((canh1 + canh2 + canh3) * (canh1 + canh2 - canh3) * ( - canh1 + canh2 + canh3 ) * ( canh1 - canh2 + canh3 )) * 1/4 ; 
                double bk = ( canh1 * canh2 * canh3 ) / (4*dt) ; 
                double dtht = Math.PI * bk * bk ;
                System.out.println(String.format("%.3f", dtht));
                
            }
            else {
                System.out.println("INVALID");
            }
            
            
        }
    }
}
