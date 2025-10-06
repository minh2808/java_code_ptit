/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01012;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while ( t-- >  0 ) {
            int n = sc.nextInt() ; 
            int cnt  = 0 ; 
            for ( int i = 1 ; i <= Math.sqrt(n) ; i++) {
                if ( n % i == 0 ) {
                    if ( i % 2 == 0 ) {
                        ++cnt ; 
                    }
                    if ( n/i % 2 == 0 && n/i != i ) {
                        ++cnt ; 
                    }
                }
            }
            System.out.println(cnt);
        }
        
    }
}
