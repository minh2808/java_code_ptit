/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05032;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Person {
    private String ten ; 
    private LocalDate ns ; 

    public Person(String ten, LocalDate ns) {
        this.ten = ten;
        this.ns = ns;
    }

    public LocalDate getNs() {
        return ns;
    }

    public String getTen() {
        return ten;
    }
    
    
    
    
    
    
}
    


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int n = sc.nextInt() ; 
       
        List<Person> arr = new ArrayList<>() ; 
        for ( int i = 0 ; i < n ; i++) {
            Person x = new Person(sc.next() , LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))) ; 
            arr.add(x) ; 
        }
        
        arr.sort(Comparator.comparing(Person::getNs).reversed()); 
        
        System.out.println(arr.get(0).getTen());
        System.out.println(arr.get(arr.size()-1).getTen());
    }
}
