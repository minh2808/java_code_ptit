/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02005;

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
        
        int n = sc.nextInt() ; 
        int m = sc.nextInt() ; 
        Set<Integer> se1 = new TreeSet<>() ; 
        Set<Integer> se2 = new TreeSet<>() ; 
        for ( int i = 0 ; i < n ; i++) {
            se1.add(sc.nextInt()) ; 
        }
        for ( int i = 0 ; i < m ; i++) {
            se2.add(sc.nextInt()) ; 
        }
        
        for (Integer a : se1 ) {
            if (se2.contains(a)) {
                System.out.print(a + " ");
            }
        }
        
    }
}
