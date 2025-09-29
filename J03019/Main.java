/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03019;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String s = sc.nextLine() ; 
        StringBuilder sb = new StringBuilder(""+ s.charAt(0)) ; 
        
        for ( int i = 1; i < s.length() ; i++ ) {
            int t = sb.length() ; 
            int index = t ; 
            for ( int j = t-1 ; j >= 0 ; j-- ){
                if ( s.charAt(i) >   sb.charAt(j) ) {
                    index = j ; 
                }
                else {
                    break ; 
                }
            }
            
            
            if ( index != t ) {
                sb.delete(index , sb.length()) ; 
            }
            sb.append(s.charAt(i)) ; 
        }
        System.out.println(sb.toString());
        
    }
}
