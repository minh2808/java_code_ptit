/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_ptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Code_ptit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int a = sc.nextInt() ; 
        int b = sc.nextInt() ; 
        
        if ( a <= 0 || b <= 0 ) {
            System.out.println("0");
        }
        else {
        
            long chuVi = (a+b)*2 ; 
            long dienTich = (long) a*b ; 
            System.out.println(chuVi + " " + dienTich); 
        }
    }
    
}
