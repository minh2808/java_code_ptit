/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Admin
 */
public class Animal {
    protected String mat ; 
    protected String mui ; 
    protected String mom ; 

    public Animal(String mat, String mui, String mom) {
        this.mat = mat;
        this.mui = mui;
        this.mom = mom;
    }

    public String getMat() {
        return mat;
    }

    public String getMui() {
        return mui;
    }

    public String getMom() {
        return mom;
    }
    
    
}
