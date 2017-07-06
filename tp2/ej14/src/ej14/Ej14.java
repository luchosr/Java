/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;
import java.util.Scanner;
/**
 *
 * @author lucianoramello
 */
public class Ej14 {

    /**
     * Crear un algoritmo que permita calcular promedio de una lista de 10 alumnos.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        
        int[] alumnos = new int[10];
           
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del alumno ");
            alumnos[i] = ingreso.nextInt();
            
        }
    }
    
}
