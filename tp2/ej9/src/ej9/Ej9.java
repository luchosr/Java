/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9;
import java.util.Scanner;


/**
 *
 * Crear un algoritmo que escriba &quot;Hola&quot; cinco veces.
 * @author lucianoramello
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        int i, veces;
        
        System.out.println("Ingrese por favor la cantidad de veces que quiere escribir HOLA!");
        veces = ingreso.nextInt();
        for ( i = 0; i < veces; i++) {
            System.out.println("HOLA WACHO!!");
        }
        
        
    }
    
}
