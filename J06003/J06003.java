/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06003;

import java.util.ArrayList;
import java.util.Scanner;


class CongViec {
    
    private int id ; 
    private String name ; 

    public CongViec(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString () {
        return name ; 
    }
    
}

 class SinhVien {
    private int id ; 
    private String msv ; 
    private String name ; 
    private String sdt ; 
    private int sttNhom ; 
    

    public SinhVien(int id, String msv, String name, String sdt, int sttNhom) {
        this.id = id;
        this.msv = msv;
        this.name = name ;
        this.sdt = sdt;
        this.sttNhom = sttNhom;
    }
    
    

    public int getId() {
        return id;
    }

    public String getMsv() {
        return msv;
    }

    public String getName() {
        return name;
    }

    public String getSdt() {
        return sdt;
    }

    public int getSttNhom() {
        return sttNhom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void setName(String ten) {
        this.name = ten;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setSttNhom(int sttNhom) {
        this.sttNhom = sttNhom;
    }
    
    @Override
    public String toString() {
        return msv + " " +  name + " " +  sdt  ; 
    }
    
    
    
}

/**
 *
 * @author Admin
 */
public class J06003 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int n = sc.nextInt() ; 
        int m = sc.nextInt() ; 
        ArrayList<SinhVien> arr = new ArrayList<>() ;  
        ArrayList<CongViec> arrCongViec = new ArrayList<>() ; 
        for (int i = 1 ; i <= n ; i++) {
            sc.nextLine() ; 
            String msv = sc.nextLine() ; 
            String name = sc.nextLine(); 
            String sdt = sc.nextLine() ; 
            int sttNhom = sc.nextInt() ; 
            SinhVien x = new SinhVien(i , msv , name , sdt ,sttNhom ) ; 
            arr.add(x) ; 
            
        }
        sc.nextLine() ; 
        for ( int i = 1 ; i <= m ; i++) {
            String name = sc.nextLine() ; 
            CongViec x = new CongViec ( i , name ) ;
            arrCongViec.add(x) ; 
        }
        int q = sc.nextInt() ; 
        while ( q -- > 0 ) {
            int k = sc.nextInt() ;
            System.out.println("DANH SACH NHOM " + k + ":");
            for (SinhVien x : arr) {
                if (x.getSttNhom() == k ) {
                    System.out.println(x.toString());
                }
            }
            
            System.out.println("Bai tap dang ky: " + arrCongViec.get(k-1));
            
        }
        
    }
    
}
