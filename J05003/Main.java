/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05003;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

class SinhVien {
    private String MSV ; 
    
    private String ten ; 
    private String lp ; 
    private String ns ; 
    private double gpa ;

    public SinhVien(int MSV, String ten, String lp, String ns, double gpa) {
        this.MSV = "B20DCCN" + String.format("%03d", MSV );
        this.ten = ten;
        this.lp = lp;
        this.ns = ns;
        this.gpa = gpa;
    }
    
    public String chuanHoa () {
        StringBuilder sb = new StringBuilder (this.ns) ; 
        if (sb.charAt(2) != '/') {
            sb.insert(0, "0") ; 
        }
        if (sb.charAt(5) != '/') {
            sb.insert(3, "0") ; 
        }
        return sb.toString() ; 
    }
    
    @Override 
    public String toString() {
        return this.MSV + " " + this.ten + " " + this.lp + " " + chuanHoa() + " " + String.format("%.2f", this.gpa) ; 
    }
   
    
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int n = sc.nextInt() ; 
        sc.nextLine() ; 
        ArrayList<SinhVien> arr = new ArrayList<>() ; 
        for ( int i = 0 ; i < n ; i++) {
            SinhVien x = new SinhVien(i+1 ,sc.nextLine() , sc.nextLine() , sc.nextLine() , Double.valueOf(sc.nextLine()) ) ; 
            arr.add(x) ; 
        }
        arr.forEach(x -> {
            System.out.println(x);
        });
    }
}
