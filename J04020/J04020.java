/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04020;

import java.util.Scanner;



class Pair <T extends Number, V extends Number> {
    private T firstNumber ; 
    private V secondNumber ;

    public Pair(T firstNumber, V secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    
    
    public boolean isPrime() {
        int a = firstNumber.intValue() ; 
        int b = secondNumber.intValue() ; 
        for (int i = 2 ; i <= Math.sqrt(a) ; i++ ) {
            if(a  % i == 0 ) {
                return false ; 
            }
        }
        for ( int i =2 ; i <= Math.sqrt(b) ; i++ ) {
            if ( b % i == 0  ) {
                return false ; 
            }
        }
        return true ; 
    }
    
    
    @Override
    public String toString() {
        return firstNumber +  " " + secondNumber   ;
    }

    
    
}
/**
 *
 * @author Admin
 */
public class J04020 {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
    
}
