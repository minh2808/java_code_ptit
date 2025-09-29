/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class HoaDon {
    private String customerId ; 
    private String customerName ; 
    private Integer oldIndex ; 
    private Integer newIndex ; 
    
    public HoaDon (Integer customerID , String customerName , Integer oldIndex , Integer newIndex ) {
        this.customerId = String.format("KH%02d", customerID) ; 
        this.customerName = customerName ; 
        this.oldIndex = oldIndex ; 
        this.newIndex = newIndex ; 
    }
    
    public Double tinhTong () {
        Integer chenhLech = this.newIndex - this.oldIndex ; 
        if ( chenhLech >= 0 && chenhLech <= 50  ) {
            Long tong = (Long) (chenhLech * 100 * 1L) ; 
            Double tongMoi = (Double) (tong + 0.02*tong) ;
            return tongMoi ; 
        }
        if (chenhLech >= 51 && chenhLech <= 100 ) {
            Long tong = (Long) 1L * (50 * 100 + (chenhLech - 50 ) * 150 ); 
            Double tongMoi = (Double) (tong + 0.03*tong) ;
            return tongMoi ;
        }
        
        if (chenhLech > 100 ) {
            Long tong = (Long) 1L * (50 * 100 + 50 * 150 + (chenhLech - 100) * 200 ) ; 
            Double tongMoi = (Double) (tong + 0.05*tong) ;
            return tongMoi ;
        }
        return null ;
    }
    
    @Override
    public String toString () {
        return this.customerId + " " + this.customerName + " " + Math.round(tinhTong()) ;
    }
}

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        
        ArrayList<HoaDon> arr  = new ArrayList<>() ; 
        for (int i = 1 ; i <= t ; i++) {
            sc.nextLine() ; 
            String name = sc.nextLine() ; 
            Integer oldIndex = sc.nextInt() ; 
            Integer newIndex = sc.nextInt() ; 
            HoaDon x = new HoaDon (i  , name , oldIndex , newIndex ) ; 
            arr.add(x) ; 
        }
        Collections.sort(arr, new Comparator<HoaDon> () {
            @Override
            public int compare(HoaDon t, HoaDon t1) {
                if ( t.tinhTong() > t1.tinhTong()) {
                    return -1 ; 
                }
                else {
                    return 1 ; 
                }
            }
            
        });
        
        for ( HoaDon x : arr ) {
            System.out.println(x);
        }
    }
    
}
