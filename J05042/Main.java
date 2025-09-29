/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class SinhVien {
    private String ten ; 
    private int cauDung ; 
    private int submit ; 

    public SinhVien(String ten, int cauDung, int submit) {
        this.ten = ten;
        this.cauDung = cauDung;
        this.submit = submit;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCauDung() {
        return cauDung;
    }

    public void setCauDung(int cauDung) {
        this.cauDung = cauDung;
    }

    public int getSubmit() {
        return submit;
    }

    public void setSubmit(int submit) {
        this.submit = submit;
    }
    
    @Override
    public String toString () {
        return ten + " " + cauDung + " " + submit ; 
    }
    
}

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in ) ; 
        
        int t = sc.nextInt() ; 
        ArrayList<SinhVien> arr = new ArrayList<>() ; 
        for ( int i =1 ; i <= t ; i++) {
            sc.nextLine() ; 
            String ten = sc.nextLine() ; 
            int cauDung = sc.nextInt() ; 
            int submit = sc.nextInt() ; 
            SinhVien x = new SinhVien ( ten , cauDung , submit ) ; 
            arr.add(x) ; 
            
        }
        
        Collections.sort(arr , new Comparator<SinhVien> () {
            @Override
            public int compare(SinhVien t, SinhVien t1) {
                if (t.getCauDung() != t1.getCauDung()) {
                    return t1.getCauDung() - t.getCauDung() ; 
                }
                else {
                    if ( t.getSubmit() != t1.getSubmit()) {
                        return t.getSubmit() - t1.getSubmit() ; 
                    }
                    return t.getTen().compareTo(t1.getTen()) ; 
                }
            }
            
        }) ; 
        
        arr.forEach(x -> System.out.println(x)); 
    }
}
