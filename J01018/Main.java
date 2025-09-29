/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01018;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while (t-- > 0 ) {
            String s = sc.nextLine() ;
            boolean  check = true ; 
            int sum = s.charAt(0) - '0' ; 
            for ( int i = 1 ; i < s.length() ; i++) {
                if (Math.abs(s.charAt(i)- s.charAt(i-1)) != 2 ) {
                    check = false ; 
                    break ; 
                }
                sum += s.charAt(i) - '0' ; 
            }
            if ( sum % 10 != 0 ) {
                check = false ; 
            }
            if ( check) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
        }
    }
   }
}
