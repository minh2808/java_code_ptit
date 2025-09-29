/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04013;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
class ThiSinh {
    private String msv; 
    private String ten ; 
    private double toan  ; 
    private double li ; 
    private double hoa ; 

    public ThiSinh(String msv, String ten, double toan, double li, double hoa) {
        this.msv = msv;
        this.ten = ten;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }

    public String getMsv() {
        return msv;
    }

    public String getTen() {
        return ten;
    }

    public double getToan() {
        return toan;
    }

    public double getLi() {
        return li;
    }

    public double getHoa() {
        return hoa;
    }
    
    
    
    
    
    public double tongDiem () {
        return this.toan + this.li + this.hoa ; 
    }
    
    public double uuTien () {
        String s = this.msv.substring(0, 3) ; 
        if ( s == "KV1"){
            return 0.5 ; 
        }
        if (s == "KV2") {
            return 1 ; 
            
        }
        if ( s == "KV3") {
            return 2.5 ;  
        }
        return 0 ; 
    }
    
    public boolean ketQua () {
        double tong = this.tongDiem() ; 
        tong += uuTien () ; 
        if (tong >= 24) {
           return true ; 
        }
        return false; 
    }
    
    
    
}

public class Main {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in) ; 
//        ThiSinh x = new ThiSinh ( sc.nextLine() , sc.nextLine() , sc.nextDouble() , sc.nextDouble() ,sc.nextDouble()) ; 
//        System.out.println(x.getMsv() + " " + x.getTen() + " " + String.format( "%.1f" , x.uuTien())  + " " + );

           System.out.println(  );
    }
    
}
