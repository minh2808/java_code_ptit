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
public class J01022 {
    
    public static void fibo (long F[] ) {
        F[1] = 1 ; 
        F[2] = 1 ; 
        for ( int i = 3 ; i < 93 ; i++) {
            F[i] = F[i-1] + F[i-2] ;      
        }
    }
    
    public static String kiTu (long F[] , int a , long b ) {
        if (a == 1 ) {
            return "0" ; 
        }
        if ( a == 2 ) {
            return "1" ; 
        }
        if ( b > F[a-2]) {
            return kiTu (F , a - 1 , b- F[a-2] ) ; 
        }
        return kiTu (F , a-2 , b ) ; 
        
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;  
        long [] F = new long[93] ; 
        fibo(F) ;
        int t = sc.nextInt() ; 
        while (t-- > 0 ) {
            int a = sc.nextInt() ; 
            long b = sc.nextLong() ; 
            
            System.out.println(kiTu ( F , a , b )) ; 
           
            
        }
    }
    
}
