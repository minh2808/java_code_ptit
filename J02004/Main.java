/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02004;

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
        int t = sc.nextInt() ; 
        while ( t-- > 0 ) {
            int n = sc.nextInt() ; 
            ArrayList<Integer> arr = new ArrayList<>() ; 
            for (int i = 1 ; i <= n ; i++) {
                arr.add(sc.nextInt()) ; 
            }
            ArrayList<Integer> arr1 = new ArrayList<>(arr) ;
            Collections.reverse(arr);
            if (arr.equals(arr1)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            
        }
    }
    
}
