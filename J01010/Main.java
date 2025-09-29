/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01010;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        
       int t = sc.nextInt() ; 
       sc.nextLine() ; 
       while(t-- > 0 ) {
           String s = sc.nextLine() ;
           StringBuilder sb = new StringBuilder("") ; 
           boolean check = true ; 
           for ( int i = 0 ; i < s.length() ; i++) {
               char c = s.charAt(i) ;
               if ( c == '0' || c == '1' || c == '8' || c == '9') {
                    if (c == '0' ) {
                        c = '0' ; 
                    }
                    if (c == '1') {
                        c = '1' ; 
                    }
                    if (c == '8') {
                        c = '0' ; 
                    }
                    if ( c == '9') {
                        c = '0' ; 
                    }
                    sb.append(c) ; 
                }
               else {
                   check = false ; 
                   break ; 
               }
            }
           
           
           if (Long.parseLong(sb.toString()) == 0 ) {
               check = false ; 
           }
           
           if ( check == true ) {
               System.out.println(Long.parseLong(sb.toString()));
           }
           else {
               System.out.println("INVALID");
           }
       }
        
    }
    
}
