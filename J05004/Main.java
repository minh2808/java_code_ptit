/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05004;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class SinhVien {
    private String msv ; 
    private String ten ; 
    private String lp ; 
    private String ns ; 
    private double gpa ; 

    public SinhVien(int msv, String ten, String lp, String ns, double gpa) {
        this.msv = "B20DCCN" + String.format("%03d", msv ); 
        this.ten = ten;
        this.lp = lp;
        this.ns = ns;
        this.gpa = gpa;
    }
    
    public String chuanHoa (String s ) {
        String t = "" ; 
        t += s.substring(0 , 1 ).toUpperCase() ; 
        if ( s.length() > 1 ) {
            t+= s.substring(1).toLowerCase() ; 
        }
        return t ; 
    }
    
    public String chuanHoaTen () {
        String[] list = this.ten.split("\\s+") ; 
        String t = "" ; 
        for ( int i = 0 ; i < list.length ; i++) {
            t += chuanHoa(list[i]) ; 
            t+= " " ; 
        }
        return t.trim() ; 
    }
    
    public String chuanHoaNs () {
        StringBuilder sb = new StringBuilder(this.ns) ; 
        if (sb.charAt(2) != '/') {
            sb.insert(0, "0") ; 
        }
        if ( sb.charAt(5) != '/') {
            sb.insert(3, "0") ; 
        }
        return sb.toString() ; 
    }
    
    @Override 
    public String toString() {
        return msv + " " + chuanHoaTen() + " " + lp + " " + chuanHoaNs() + " " + String.format("%.2f", gpa ) ; 
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int n = sc.nextInt() ; 
        sc.nextLine() ; 
        ArrayList<SinhVien> arr = new ArrayList<>() ; 
        for ( int i = 0 ; i < n ; i++) {
            SinhVien x = new SinhVien(i+1 , sc.nextLine().trim() , sc.nextLine().trim() , sc.nextLine().trim() , Double.valueOf(sc.nextLine().trim())) ; 
            arr.add(x) ; 
        }
        
        arr.forEach(x -> {
            System.out.println(x);
        });
        
    }
}
