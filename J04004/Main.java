/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04004;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class PhanSo {
    private long tu ; 
    private long mau ; 

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    
    public long UCLN (long a , long b ) {
        while ( b != 0 ) {
            long tmp = a ; 
            a = b ; 
            b = tmp% b ; 
            
        }
        return a ; 
    }
    
    public long BCNN ( long a , long b ) {
        return 1l * a * b / UCLN (a , b ) ; 
    }
    
    public PhanSo reduce ( PhanSo a ) {
        long ucln = UCLN (a.getTu() , a.getMau()) ; 
        return new PhanSo (a.getTu()/ucln  , a.getMau()/ucln ) ; 
    }
    
    public PhanSo add ( PhanSo a ) {
        PhanSo x = reduce(this) ;
        PhanSo y = reduce(a) ; 
        long bcnn = BCNN(x.getMau() , y.getMau()) ; 
        long tuTong = 1l*x.getTu()*(bcnn/x.getMau()) + 1l*y.getTu()* (bcnn/y.getMau()) ; 
        PhanSo c = new PhanSo(tuTong , bcnn ) ; 
        PhanSo c1 = reduce(c) ; 
        return c1 ; 
    }
    
    
    
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        PhanSo x = new PhanSo ( sc.nextLong() , sc.nextLong()) ; 
        PhanSo y = new PhanSo ( sc.nextLong() , sc.nextLong()) ; 
        PhanSo c = x.add(y) ; 
        System.out.println(c.getTu() + "/" + c.getMau());
    }
}