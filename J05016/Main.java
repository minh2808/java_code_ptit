/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05016;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Customer {
    private String maKH ; 
    private String tenKH ; 
    private String soPhong ; 
    private LocalDate ngayNhan ; 
    private LocalDate ngayTra ; 
    private int dichVu ; 

    public Customer(String maKH, String tenKH, String soPhong, LocalDate ngayNhan, LocalDate ngayTra , int dichVu) {
        this.maKH = "KH" + String.format("%02d", Integer.parseInt(maKH) );
        this.tenKH = tenKH;
        this.soPhong = soPhong;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.dichVu = dichVu ; 
    }
    
    public long soNgay () {
        return ChronoUnit.DAYS.between(ngayNhan, ngayTra) + 1  ; 
    }
    
    public long soTien () {
        char c = soPhong.charAt(0) ; 
        if ( c == '1') {
            return 25 * soNgay()+ dichVu ; 
        }
        if ( c == '2') {
            return 34 * soNgay() + dichVu ; 
        }
        if ( c == '3') {
            return 50 * soNgay() + dichVu ; 
        }
        if ( c == '4') {
            return 80 * soNgay() + dichVu ; 
        }
        return 0 ; 
    }
    
    @Override 
    public String toString () {
        return maKH + " " + tenKH + " " + soPhong + " " + soNgay() + " " + soTien() ; 
    }
    
    
    
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int n = sc.nextInt() ;
        sc.nextLine() ; 
        ArrayList<Customer> arr = new ArrayList<>() ; 
        for ( int i = 0 ; i < n ; i++) {
            Customer c = new Customer(String.valueOf(i+1) , sc.nextLine().trim() , sc.nextLine().trim() , 
                    LocalDate.parse(sc.nextLine().trim() , DateTimeFormatter.ofPattern("dd/MM/yyyy")) , LocalDate.parse(sc.nextLine().trim() , DateTimeFormatter.ofPattern("dd/MM/yyyy")) , 
                    Integer.parseInt(sc.nextLine()) ) ;
            arr.add(c) ; 
            
        }
        
        arr.sort(Comparator.comparing(Customer::soTien).reversed()) ; 
        
        arr.forEach((x) -> {
            System.out.println(x);
        });
        
        
    }
}
