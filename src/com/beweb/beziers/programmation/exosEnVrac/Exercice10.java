/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac;

/**
 *
 * @author judi
 */
public class Exercice10 {

     // Methods
    public static void launch(){
        System.out.println("*******************************");
        System.out.println("Exercice 10 : \n");
        
        // Declare and initialize all variables 
        long n1 = 0, n2 = 1, n3, i ,count = 100;
        // Insert the first two values of fibonachi suite
        System.out.print(n1);  
        System.out.print(" " + n2); 
        
        // 100 times print the fibonachi suite
        for (i = 2 ; i < count; ++i){
            // Add up the two previous values of interation
            n3 = n1 + n2;    
            System.out.print(" " + n3); 
            // Assign the two next values of interation
            n1 = n2;    
            n2 = n3;    
        }        
    }  
}
