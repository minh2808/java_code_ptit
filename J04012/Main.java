/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04012;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class NhanVien {
    private String mnv ; 
    private String name ; 
    private int luongCoBan ; 
    private int soNgayCong ; 
    private String chucVu ; 
    private long luongThang ; 
    private double thuong ; 
    private long phuCap ; 
    private double thuNhap ; 

    public NhanVien(String name, int luongCoBan, int soNgayCong, String chucVu) {
        this.name = name;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
        this.luongThang = 1L * this.luongCoBan * soNgayCong ; 
        this.thuong = tinhThuong() ; 
        this.phuCap = tinhPhuCap() ; 
        this.thuNhap = this.luongThang + this.thuong + this.phuCap ; 
    }
    
    
    public double  tinhThuong () {
        double tmp  = 0  ; 
        if ( this.soNgayCong >=  25 ) {
            tmp = this.luongThang * 0.2 ; 
        }
        if ( this.soNgayCong >= 22 && this.soNgayCong < 25 ) {
            tmp = this.luongThang * 0.1 ; 
        }
        if ( this.soNgayCong < 22 ) {
            tmp = 0 ; 
        }
        return tmp ; 
    }
    
    public long tinhPhuCap () {
        long tmp = 0 ; 
        if ( this.chucVu.equals("GD")) {
            tmp = 250000 ; 
        }
        if ( this.chucVu.equals("PGD")) {
            tmp = 200000 ; 
        }
        if ( this.chucVu.equals("TP")) {
            tmp = 180000 ; 
        }
        if ( this.chucVu.equals("NV")) {
            tmp = 150000 ; 
        }
        
        return tmp ; 
    }
    
    @Override
    public String toString () {
        return "NV01" + " " + this.name + " " + this.luongThang + " " + Math.round(this.thuong) + " " + this.phuCap + " " + Math.round(this.thuNhap) ;  
    }
    
    
    
    
    
}


public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ; 
        String ten = sc.nextLine() ; 
        int luongCoBan = sc.nextInt() ; 
        int soNgay = sc.nextInt() ; 
        
        sc.nextLine() ; 
        String chucVu = sc.nextLine() ; 
        NhanVien x = new NhanVien ( ten , luongCoBan , soNgay , chucVu ) ; 
        
        System.out.println(x);
    }
    
}
