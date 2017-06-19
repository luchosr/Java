/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;
import java.util.Scanner;

/**
 *
 * Diseñar el algoritmo (Diagrama de flujo y pseudocódigo) correspondiente a un

programa que tras introducir una medida expresada en centímetros la convierta en

pulgadas (1 pulgada = 2,54 centímetros).
 * @author lucianoramello
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float cm;
        double pulg = 2.54;
        
        System.out.println("Ingrese la cantidad de centimetros para convertirlos a pulgadas");
        cm = entrada.nextInt();
        System.out.println("La medida que usted obtiene es de " + (cm * pulg) + " pulgadas");
        // TODO code application logic here
    }
    
}
