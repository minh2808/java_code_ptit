/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03010;

import java.util.HashMap;
import java.util.Map;
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
        Map<String , Integer> mp = new HashMap<>() ; 
        while ( t-- >  0 ) {
            String s = sc.nextLine() ;
            s = s.trim() ; 
            String[] arr = s.split("\\s+") ; 
            String k = "" ; 
            k+= arr[arr.length-1].toLowerCase() ; 
            for (int i = 0 ; i < arr.length - 1 ; i++) {
                k += Character.toLowerCase(arr[i].charAt(0)) ; 
            }
            if ( mp.containsKey(k)) {
                mp.put(k, mp.get(k) + 1 ) ; 
                k += String.valueOf(mp.get(k)) ; 
            }
            else {
                mp.put(k, 1) ; 
            }
             k += "@ptit.edu.vn" ; 
             System.out.println(k);
        }
    }
}
