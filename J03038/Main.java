/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03038;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        String s = sc.nextLine() ; 
        Set<Character> se = new HashSet<>() ; 
        for (int i = 0 ; i < s.length() ; i++) {
            se.add(s.charAt(i)) ; 
        }
        System.out.println(se.size());
    }
    
}
