/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        File file = new File ("DATA.in") ; 
        try { 
            Scanner sc = new Scanner (file ) ;
            Map <Integer , Integer> mp = new TreeMap<>() ; 
            while ( sc.hasNext()) {
                Integer k = sc.nextInt() ; 
                if ( mp.containsKey(k)) {
                    mp.put(k , mp.get(k) + 1 ) ; 
                }
                else {
                    mp.put(k, 1) ; 
                }
                
                
            }
            mp.forEach((k , v) -> {
                System.out.println(k + " " + v );
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
