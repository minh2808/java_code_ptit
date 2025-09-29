
package J03020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */



public class Main {
    
    public static boolean check ( String s) {
        String t = "" ; 
        for ( int i = s.length()- 1 ; i >= 0 ; i--) {
            t += s.charAt(i) ; 
        } 
        if ( s.equals(t) ) {
            return true ; 
        }
        return false ; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        ArrayList<String> a = new ArrayList<>() ; 
        while (sc.hasNext()) {
            String s = sc.next() ; 
            
            a.add(s) ; 
        }
        

        
        Map<String , Integer> mp = new TreeMap<>() ; 
        int max_len = Integer.MIN_VALUE ; 
        for ( int i = 0 ; i < a.size() ; i++) {
            if ( check(a.get(i))) {
                if (a.get(i).length() > max_len ) {
                    max_len = a.get(i).length() ; 
                }
                if ( mp.containsKey(a.get(i))) {
                    mp.put(a.get(i), mp.get(a.get(i)) + 1 ) ; 
                }
                else {
                    mp.put(a.get(i), 1 ) ; 
                }
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = mp.entrySet() ; 
        for (Map.Entry<String, Integer> entry : entrySet ) {
            
            if (entry.getKey().length() == (max_len) ) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        
        
          
        
        
        
    }
}