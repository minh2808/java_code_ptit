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
public class J01024 {
    
    public static boolean  check ( String s ) {
        boolean status = true ; 
        for (int i = 0 ; i < s.length() ; i++) {
            if ( s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2' ) {
                status = false ; 
                break ; 
            }
        }
        return status ; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while (t-- >  0 ) {
            String s = sc.nextLine() ; 
            if ( check(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    
}
