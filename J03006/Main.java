/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03006;

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
           boolean check = true ; 
           for (int i = 1 ; i < s.length() ; i++) {
               if ( (s.charAt(i) - '0') % 2 != 0 ) {
                   check = false ; 
                   break ; 
               }
           }
           if (check) {
               System.out.println("YES");
           }
           else {
               System.out.println("NO");
           }
        }
    }
    
}
