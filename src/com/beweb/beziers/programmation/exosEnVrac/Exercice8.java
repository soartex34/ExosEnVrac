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
public class Exercice8 {
    public static void launch(){
        //initalisation de ma variable
        int entiere = 243;
        //temps que entiere et superieur ou egale a 0 la boucle tourne
        while(entiere >= 0 +1){
                //decrementation
                entiere--;
            //affiche la valeur entiere    
            System.out.println(entiere);
            //si entiere et egale a zero ca affiche pair et si c est egale a 1 ca affiche impert
            if(entiere%2 ==0){
                System.out.print("impert ");
            }else{
                System.out.print("pair   ");
            }
            // regarde si c est un multiple de 5 ...
            if(entiere%5 ==0){
                System.out.print("");
            }else{
                System.out.print("est un miltiple de 5       ");
            }
            if(entiere%10 ==0){
                System.out.print("");
            }else{
                System.out.print("est un miltiple de 10       ");       
            }
        }
}
}
