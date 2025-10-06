package tren_lp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("work1.txt") ; 
        Scanner sc = new Scanner(file);
        
        while ( sc.hasNextLine()) {
            String a = sc.next() ; 
            int sum = 0 ; 
            while (sc.hasNextInt()) {
                sum += sc.nextInt() ;
                    
            }
            System.out.println(a + ": " + sum );
        }
        
        sc.close(); 
        z
       
    }
}
