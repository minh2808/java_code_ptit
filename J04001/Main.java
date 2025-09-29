/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04001;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Point {
    private double x ; 
    private double y ; 

    public Point() {
    }

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
    
    public double distance (Point point ) {
        double result = (point.x - this.x) * ( point.x - this.x) + ( point.y - this.y ) * ( point.y - this.y) ; 
        return Math.sqrt(result) ; 
    }
    
   
}

public class Main {
    
    public static double distance ( Point point1 , Point point2 ) {
        double result = (point1.getX() - point2.getX()) * ( point1.getX() - point2.getX()) + ( point1.getY() - point2.getY() ) * ( point1.getY() - point2.getY()) ; 
        return Math.sqrt(result) ; 
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int t =sc.nextInt() ; 
        while (t-- > 0 ) { 
            ArrayList <Point> arr = new ArrayList<>() ; 
            for ( int i = 0 ; i <= 1 ; i++) {
                Point x = new Point (sc.nextDouble() , sc.nextDouble() );
                arr.add(x) ; 
            }
            double result = distance(arr.get(0) , arr.get(1)) ; 
            System.out.println(String.format("%.4f" , result ) );
            
        }
    }
    
}
