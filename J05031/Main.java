/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05031;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class SinhVien {
    private long stt ; 
    private String msv ; 
    private String ten  ;
    private String lp ; 
    private double diem1 , diem2 , diem3 ; 

    public SinhVien(long stt, String msv, String ten, String lp, double diem1, double diem2, double diem3) {
        this.stt = stt;
        this.msv = msv;
        this.ten = ten;
        this.lp = lp;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public long getStt() {
        return stt;
    }

    public String getMsv() {
        return msv;
    }

    public String getTen() {
        return ten;
    }

    public String getLp() {
        return lp;
    }

    public double getDiem1() {
        return diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public double getDiem3() {
        return diem3;
    }
    
    @Override 
    public String toString () {
        return msv + " "  + ten + " " + lp + " " + String.format("%.1f", diem1) + " " + String.format("%.1f", diem2) + " " + String.format("%.1f", diem3) ; 
    }
    
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int n = sc.nextInt() ; 
        sc.nextLine() ; 
        ArrayList<SinhVien> arr = new ArrayList<>() ; 
        for ( int i = 0 ; i < n ; i++) {
            SinhVien x = new SinhVien(i+1 , sc.nextLine() , sc.nextLine() , sc.nextLine() , 
                    Double.valueOf(sc.nextLine()) ,Double.valueOf(sc.nextLine()), Double.valueOf(sc.nextLine())) ; 
            
            arr.add(x) ; 
        }
        
        arr.sort(Comparator.comparing(SinhVien::getTen));
        
        int cnt = 1 ; 
        
        for ( int i = 0 ; i < n ; i++) {
            System.out.print((i+1) + " ");
            System.out.println(arr.get(i));
        }
    }
}
