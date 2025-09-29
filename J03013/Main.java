/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03013;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t= sc.nextInt() ; 
        sc.nextLine() ;
        while (t-- > 0 ) {
            
            BigInteger a = new BigInteger(sc.nextLine()) ; 
            BigInteger b = new BigInteger(sc.nextLine()) ; 
            int length = Math.max(a.toString().length(), b.toString().length()) ; 
            BigInteger c = (a.subtract(b).abs()) ; 
            String ans = c.toString();
            while(ans.length()< length) ans = "0" + ans;
            System.out.println(c); 
        }
        
    }
}
