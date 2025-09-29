/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        ArrayList <Integer> arr1 = new ArrayList<>() ; 
        ArrayList <Integer> arr2 = new ArrayList<>() ; 
        for (int i = 0; i < 4 ; i++) {
            Integer x = sc.nextInt() ;
            if ( i % 2 == 0 ) {
                arr1.add(x) ; 
            }
            else {
                arr2.add(x) ; 
            }
        }
        for (int i = 0 ; i < 4 ; i++) {
            Integer x = sc.nextInt() ; 
            if ( i % 2 == 0 ) {
                arr1.add(x) ; 
            }
            else {
                arr2.add(x) ; 
            }
        }
        
        int minHoanh = Collections.min(arr1) ; 
        int maxHoanh = Collections.max(arr1) ; 
        
        int minTung = Collections.min(arr2) ; 
        int maxTung = Collections.max (arr2) ; 
        
        int canhHv = Math.max( maxHoanh - minHoanh , maxTung - minTung ) ; 
        System.out.println(1L*canhHv * canhHv );
        
        
        
        
        
    }
    
}
