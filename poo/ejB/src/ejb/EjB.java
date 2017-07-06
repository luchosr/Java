/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;
 import java.util.Scanner;
 
/**
 *
 * b) Diseñar un programa donde el usuario ingrese un valor inicial y un valor final.

La aplicación debe mostrar todos los números entre el valor incial y el final.

Ejemplo: valor inicial=4, valor final=7; debe mostrar 4,5,6,7.
 * @author lucianoramello
 */
public class EjB {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        for (int i = 4; i <= 7; i++) {
            
            System.out.println(i);
            
        }
    }
    
}
