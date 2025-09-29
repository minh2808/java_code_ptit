/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03014;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        BigInteger a = new BigInteger(sc.nextLine()) ; 
        BigInteger b = new BigInteger(sc.nextLine()) ; 
        BigInteger c = a.add(b) ; 
        System.out.println(c);
        
    }
}
