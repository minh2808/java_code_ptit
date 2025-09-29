/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03022;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static String chuanHoa(String s ) {
        String[] arr = s.split("\\s+") ; 
        String res = "" ; 
        res += s.charAt(0) ; 
        res 
        
        for ( int i = 0 ; i < arr.length ; i++) {
            String s1 = "" ; 
            if ( i == 0 ) {
                s1 += Character.toUpperCase(arr[i].charAt(0)) ; 
                for ( int j = 1 ; j < arr[i].length() ; j++) {
                    s1 += Character.toLowerCase(arr[i].charAt(j)) ; 
                }
            }
            else {
                for ( int j = 0 ; j < arr[i].length() ; j++) {
                    s1 += Character.toLowerCase(arr[i].charAt(j)) ; 
                }
            }
            s1 += " " ; 
            res += s1 ; 
        }
        return res ; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        String s = sc.nextLine() ; 
        String[] arr = s.split("[.?!]+") ; 
        for ( int i = 0 ; i < arr.length ; i++) {
            arr[i] = arr[i].trim() ; 
            String s1 = chuanHoa(arr[i]) ; 
            System.out.println(s1.trim());
            
        }
        
    }
}