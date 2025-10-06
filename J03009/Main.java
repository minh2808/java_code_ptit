/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03009;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while ( t-- > 0 ) {
            String s1  = sc.nextLine() ; 
            String s2 = sc.nextLine() ; 
            String [] arr1 = s1.split("\\s+") ; 
            String [] arr2 = s1.split("\\s+") ; 
            
            Set<String> se1 = new TreeSet<>() ; 
            Set<String> se2 = new TreeSet<>() ;
            for ( String x : arr1 ) {
                se1.add(x) ; 
            }
            for ( String x : arr1 ) {
                se2.add(x) ; 
            }
            
            for ( String s : se1 ) {
                if (!s2.contains(s)) {
                    System.out.print(s + " ");
                }
            }
            System.out.println();

            
        }
    }
}
