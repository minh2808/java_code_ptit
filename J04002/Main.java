/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04002;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Rectangle {
    private int width ; 
    private int height ; 
    private String color ; 

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color.trim();
    }
    
    
    public boolean check () {
        if ( width <= 0 || height <= 0 ) {
            return false ; 
        }
        return true ; 
    }

    
    
    public long chuVi () {
        return 1L* (this.width + this.height) * 2 ; 
    }
    
    public long dienTich () {
        return 1L * this.width * this.height ; 
    }
    
    public String chuanHoa () {
        String s = this.color ; 
        StringBuilder sb = new StringBuilder("") ;
        sb.append(Character.toUpperCase(s.charAt(0))) ; 
        for ( int i = 1 ; i < this.color.length() ; i++) {
            sb.append(Character.toLowerCase(s.charAt(i))) ; 
        }
        return sb.toString() ; 
        
    }
    
}


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in) ; 
        Rectangle rec = new Rectangle (sc.nextInt() , sc.nextInt() , sc.nextLine()) ; 
        if ( rec.check()) {
            System.out.println(rec.chuVi() + " " + rec.dienTich() + " " + rec.chuanHoa()); 
        }
        else {
            System.out.println("INVALID");
        }
    }
    
}
