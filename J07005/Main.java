/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07005;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    public static void main(String[] args) throws FileNotFoundException {
        try {
            DataInputStream sc = new DataInputStream(new FileInputStream("DATA.in")) ; 
            Map<Integer , Integer> mp = new TreeMap<>() ; 
            try {
                
                while ( true ) {
                    int doc = sc.readInt() ; 
                    if (mp.containsKey(doc)) {
                        mp.put(doc, mp.get(doc) + 1 ) ; 
                    }
                    else {
                        mp.put(doc, 1) ; 
                    }
                }
            }
            catch (IOException e) {
                mp.forEach((k , v) -> {
                    System.out.println(k + " " + v );
                });
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
