/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05028;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Company {
    private String mdn ; 
    private String tdn ; 
    private long ssv ; 

    public Company(String mdn, String tdn, long ssv) {
        this.mdn = mdn;
        this.tdn = tdn;
        this.ssv = ssv;
    }

    public long getSsv() {
        return ssv;
    }

    public String getMdn() {
        return mdn;
    }
    
    
    @Override 
    public String toString() {
        return mdn + " " + tdn + " " + ssv ; 
    }
    
    
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int n = sc.nextInt() ; 
        sc.nextLine() ; 
        ArrayList<Company> arr = new ArrayList<>() ; 
        for ( int i = 0 ; i < n ; i++) {
            Company c = new Company (sc.nextLine() , sc.nextLine() , Long.valueOf(sc.nextLine())) ; 
            arr.add(c) ; 
        }
        
        arr.sort(Comparator.comparingLong(Company::getSsv).reversed()
                            .thenComparing(Company::getMdn)); 
        
        arr.forEach(x -> {
            System.out.println(x);
        });
    }
}
