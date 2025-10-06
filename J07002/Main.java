/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07002;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in") ; 
        Scanner sc = new Scanner (file) ; 
        long sum  =0 ; 
        while ( sc.hasNext()) {
            String s = sc.next() ; 
            try {
                sum += Long.parseLong(s) ; 
            } catch (Exception e ) {
                continue ; 
            }
        }
        System.out.println(sum);
    }
}
