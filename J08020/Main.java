/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08020;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while ( t-- > 0 ) {
            String s = sc.nextLine() ; 
            Stack<Character> st = new Stack<>() ; 
            Map<Character , Character> mp = new HashMap<>() ; 
            mp.put(')' , '(') ; 
            mp.put(']' , '[') ; 
            mp.put('}' , '{') ; 
            boolean  check = true ; 
            for (int i = 0 ; i < s.length() ; i++) {
                char c = s.charAt(i) ; 
               if ( mp.containsValue(c)) {
                   st.push(c) ; 
               }
               else {
                   if ( !st.empty()) {
                       if (mp.containsKey(c) && mp.get(c) == st.peek() ) {
                           st.pop() ; 
                       }
                       else {
                           check = false ; 
                           break ; 
                       }
                   }
               }
            }
            if ( !st.empty()) {
                check = false ; 
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
}
