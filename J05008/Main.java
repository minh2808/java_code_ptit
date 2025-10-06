/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05008;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Point {
    private double x ; 
    private double y ; 

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
        int n = sc.nextInt() ; 
        
        while ( n-- > 0 ) {
            ArrayList<Point> arr = new ArrayList<>() ; 

            int k = sc.nextInt() ;
            int t = k ; 
            while ( k-- >  0 ) {
                Point x = new Point(Double.valueOf(sc.next()) , Double.valueOf(sc.next()) ) ; 
                arr.add(x) ; 
            }
            
            double sum = 0;
            for ( int i = 0 ; i < t-1 ; i++) {
                double result = arr.get(i).getX()*arr.get(i+1).getY() - arr.get(i+1).getX() * arr.get(i).getY() ; 
                sum += result ; 
            }
            
            sum += arr.get(t-1).getX()*arr.get(0).getY() 
        - arr.get(0).getX()*arr.get(t-1).getY();

            System.out.println(String.format("%.3f", 0.5 * Math.abs(sum)) );
            
        }
    }
}
