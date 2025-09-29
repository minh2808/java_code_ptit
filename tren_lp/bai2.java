/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tren_lp;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
       int [] a = new int[n] ; 
       for ( int i = 0 ; i < n ; i++) {
           a[i] = sc.nextInt() ; 
       }
        for (int i = 0  ; i < n ; i++ ) {
           System.out.print(a[i] + " ");
       }
       int first = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        System.out.println();
        a[a.length - 1] = first;
        for (int i = 0  ; i < n ; i++ ) {
           System.out.print(a[i] + " ");
       }
    }
    
}
