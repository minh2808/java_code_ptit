/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01003;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int a =sc.nextInt() ; 
        int b = sc.nextInt(); 
        if ( a ==0 && b != 0 ) {
            System.out.println("VN");
        }
        if ( a == 0 && b == 0 ) {
            System.out.println("VSN");
        }
        
        if ( a != 0 ) {
            double k = 1.0 * (-b )/ a  ; 
            System.out.println(String.format("%.02f", k ));
        }
        
    }
}
