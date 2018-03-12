/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac;
import java.util.Arrays;
/**
 *
 * @author judi
 */
public class Exercice6 {
    public static void launch(){
        
        System.out.println("*******************************");
        System.out.println("Exercice 6 : \n");
        
        boolean boolTab[] = new boolean[10];
        int i = 0;
        
        // Insert true value at the index 0 and 1 of the boolTab
        while (i <= 1){
            boolTab[i] = true;
            i++;
        }
        // Insert false value at the index 2 and 3 of the boolTab
        while (i <= 2){
            i++;
            boolTab[i] = false;
        }
        // Insert true and false values at the index 4 to 9 of the boolTab
        while (i < 9){
            i++;
            if (i % 2 == 0){
                boolTab[i] = true;
            } else {
                boolTab[i] = false;
            }
        }
        //Convert array to string for display the content of boolTab
        System.out.println(Arrays.toString(boolTab));   
    }   
        
}


