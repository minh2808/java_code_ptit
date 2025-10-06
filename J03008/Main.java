/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03008;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static boolean check ( String s ) {
        String t = "" ; 
        for (int i = s.length() - 1 ;  i >= 0 ; i-- ) {
            char c = s.charAt(i) ; 
            if ( c!= '2' && c!= '3' && c != '5' && c != '7') {
                return false ; 
            }
            t += s.charAt(i) ; 
        }
        if (!s.equals(t) ) {
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
