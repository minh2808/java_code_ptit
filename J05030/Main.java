/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05030;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class SinhVien {
    private long id ; 
    private String msv ; 
    private String ten ; 
    private String lop ; 
    private double diem1 ; 
    private double diem2 ; 
    private double diem3; 

    public SinhVien(long id, String msv, String ten, String lop, double diem1, double diem2, double diem3) {
        this.id = id;
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getMsv() {
        return msv;
    }
    
    @Override
    public String toString() {
        return this.msv + " " + this.ten + " " + this.lop + " " + String.format("%.1f", this.diem1) + " " + String.format("%.1f", this.diem2) + " " + String.format("%.1f", this.diem3) ; 
        
    }
    
    
    
    
    
}

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        long t = sc.nextLong() ; 
        
        ArrayList<SinhVien> arr = new ArrayList<>() ; 
        for  (long i = 1 ;i <= t ; i++) {
            sc.nextLine() ; 
            SinhVien x = new SinhVien(i , sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextDouble() , sc.nextDouble() , sc.nextDouble()) ; 
            arr.add(x) ; 
        }
        
        Collections.sort(arr, new Comparator<SinhVien> () {
            @Override
            public int compare(SinhVien t, SinhVien t1) {
                return t.getMsv().compareTo(t1.getMsv()) ; 
            }
            
        });
        
        for ( int i = 1 ; i <= arr.size() ; i++) {
            System.out.print(i + " ");
            System.out.println(arr.get(i-1)); 
        }
        
        
        
    }
}
