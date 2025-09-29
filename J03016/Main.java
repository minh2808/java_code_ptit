/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03016;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while(t-- > 0 ) {
            BigInteger a = new BigInteger(sc.nextLine()) ; 
            if (a.mod(BigInteger.valueOf(11)).equals(BigInteger.valueOf(0)) ) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
