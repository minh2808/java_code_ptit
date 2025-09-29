/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03004;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static String chuanHoa (String s ) {
        StringBuilder sb = new StringBuilder ("") ; 
        sb.append(Character.toUpperCase(s.charAt(0))) ; 
        for (int i = 1 ; i < s.length() ; i++) {
            sb.append(Character.toLowerCase(s.charAt(i))) ; 
        }
        return sb.toString(); 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while (t-- > 0 ) {
            String s = sc.nextLine() ; 
            String[] arr = s.trim().split("\\s+") ;  
            String result = "" ; 
            for (int i = 1 ; i < arr.length ; i++) {
                
             result += chuanHoa(arr[i]) ; 
               result += " " ; 
            }
            result = result.trim() ; 
            result += ", " ; 
            result += arr[0].toUpperCase() ; 
            result = result.trim() ; 
            System.out.println(result);
            
        }
    }
    
}
