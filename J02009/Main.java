/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02009;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


 class Customer {
    
    private Integer startCheck ; 
    private Integer duration ; 

    public Customer(Integer startCheck, Integer duration) {
        this.startCheck = startCheck;
        this.duration = duration;
    }
    
    

    public Integer getStartCheck() {
        return startCheck;
    }
    

    public Integer getDuration() {
        return duration;
    }

    public void setStartCheck(Integer startCheck) {
        this.startCheck = startCheck;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    
}

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int n = sc.nextInt() ; 
        ArrayList<Customer> arr = new  ArrayList<> () ; 
        for ( int i = 0 ; i < n ; i++) {
            Customer c = new Customer(sc.nextInt() , sc.nextInt()) ; 
            arr.add(c) ; 
            
        }
        
        arr.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer t, Customer t1) {
                if ( t.getStartCheck() != t1.getStartCheck()) {
                    return t.getStartCheck() - t1.getStartCheck() ; 
                }
                return t.getDuration()- t1.getDuration() ; 
            }
            
        });
        
        int time = 0 ; 
        for ( int i = 0 ; i < arr.size() ; i++) {
            int startCheck = arr.get(i).getStartCheck() ; 
            int duration = arr.get(i).getDuration() ; 
            if (startCheck >= time ) {
                time = startCheck + duration ; 
            } 
            else {
                time = time + duration ; 
            }
        }
        
        System.out.println(time);
    }
}
