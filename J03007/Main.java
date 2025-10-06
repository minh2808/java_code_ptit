/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03007;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static boolean check (String s ) {
        if (s.charAt(0) != '8' || s.charAt(s.length()-1) != '8') {
            return false ; 
        }
        long sum = 0 ; 
        for ( int i = 0 ; i < s.length() ; i++) {
            sum += s.charAt(i) - '0' ; 
        }
        if ( sum % 10 != 0 ) {
            return false ; 
        }
        return true ; 
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int  t = sc.nextInt() ; 
        sc.nextLine() ; 
        while ( t-- >  0 ) {
            String s = sc.nextLine() ; 
            if (check(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO"); 
            }
        }
    }
}
