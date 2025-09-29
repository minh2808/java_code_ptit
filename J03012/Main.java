/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03012;

import java.math.BigInteger;
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
            BigInteger a = new BigInteger(sc.next()) ; 
            BigInteger b = new BigInteger(sc.next()) ; 
            BigInteger c = a.add(b) ; 
            System.out.println(c.toString());
        }
    }
}