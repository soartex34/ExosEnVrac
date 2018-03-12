/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author judi
 */
public class Exercice11 {
     public static void launch(){
        System.out.println("*******************************");
        System.out.println("Exercice 11 : \n");
        
        // Initialize the tab and arrays lists
        int suite[] = new int[1000];
        ArrayList nombrePairs = new ArrayList();
        ArrayList nombreImpairs = new ArrayList();
        ArrayList multiplesdecinq = new ArrayList();
        ArrayList multiplesDeTrois = new ArrayList();
        
        // Add the frist thousand number of the fibonachi suite in suite tab 
        int n1 = 0, n2 = 1, n3; 
        
        suite[0] = n1; 
        suite[1] = n2; 
        
        for (int i = 2; i < suite.length; ++i){ 
            n3 = n1 + n2;    
            suite[i] = n3; 
            n1 = n2;    
            n2 = n3; 
        }  
        
        // Display the suite tab content and her length
        System.out.println("le tableau 'suite' contient " + suite.length + " valeurs : ");
        System.out.println(Arrays.toString(suite)); 
        System.out.println("********************************* \n");
        
        for (int a = 0; a < suite.length; a++){ 
            // Find and stock the all pair numbers in the fibonachi suite in suite array
            if (suite[a] % 2 == 0){
                nombrePairs.add(suite[a]); 
            } 
        } 
        
        System.out.println("le tableau 'nombrePairs' contient " + nombrePairs.size() + " valeurs : ");
        System.out.println(Arrays.toString(nombrePairs.toArray())); 
        System.out.println("********************************* \n");
        
        for (int g = 0; g < suite.length; g++){ 
            if (suite[g] % 2 == 1){
                // Find and stock the all odd number in the fibonachi suite in nombreImpair arraylist
                nombreImpairs.add(suite[g]); 
            }
        } 
        
        System.out.println("le tableau 'nombreImpairs' contient " + nombreImpairs.size() + " valeurs : ");
        System.out.println(Arrays.toString(nombreImpairs.toArray()));
        System.out.println("********************************* \n");
        
        for (int c = 0; c < suite.length; c++){ 
            // Find and stock the all multiple of 5 in the fibonachi suite in multiplesdecinq arraylist
            if (suite[c] % 5 == 0){
                multiplesdecinq.add(suite[c]); 
            }
        } 
        
        System.out.println("le tableau 'multiplesdecinq' contient " + multiplesdecinq.size() + " valeurs : ");
        System.out.println(Arrays.toString(multiplesdecinq.toArray()));
        System.out.println("********************************* \n");
        
        for (int m = 0; m < suite.length; m++){ 
            // Find and stock the all multiple of 3 in the fibonachi suite in multiplesDeTrois arraylist
            if (suite[m] % 3 == 0){
                multiplesDeTrois.add(suite[m]); 
            }
        } 
        
        System.out.println("le tableau 'multiplesDeTrois' contient " + multiplesDeTrois.size() + " valeurs : ");
        System.out.println(Arrays.toString(multiplesDeTrois.toArray()));
        System.out.println("********************************* \n");
        
    }
}
